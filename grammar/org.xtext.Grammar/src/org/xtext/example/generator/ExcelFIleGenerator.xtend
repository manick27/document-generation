package org.xtext.example.generator

import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.util.IOUtils
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URL
import java.io.InputStream

class ExcelFileGenerator {
    private Context context1
    private HtmlCodeGenerator seqgeneratorHtml

    // Constructeur pour initialiser context1
    new(Context context) {
        this.context1 = context
        this.seqgeneratorHtml = new HtmlCodeGenerator(this.context1)
    }

    def generate(String htmlCode, String fileName) { 
        try {
            convertHtmlToExcel(htmlCode, fileName)
            System.out.println("Excel file created successfully!")
        } catch (IOException e) {
            e.printStackTrace()
        }
    }

    def convertHtmlToExcel(String htmlContent, String excelFilePath) throws IOException {
        // Parse HTML content
        val Document htmlDoc = Jsoup.parse(htmlContent)

        // Create a new Excel workbook
        val Workbook workbook = new XSSFWorkbook()

        // Extract all tables from HTML
        val Elements tables = htmlDoc.select("table")
        var int tableIndex = 1
        for (Element table : tables) {
            val Sheet sheet = workbook.createSheet("Sheet" + tableIndex++)
            val Elements rows = table.select("tr")

            var int rowIndex = 0
            for (Element row : rows) {
                val Row excelRow = sheet.createRow(rowIndex++)
                val Elements cells = row.select("th, td")

                var int cellIndex = 0
                for (Element cell : cells) {
                    val Cell excelCell = excelRow.createCell(cellIndex++)
                    excelCell.setCellValue(cell.text())
                    
                    // Apply CSS styles if available
                    applyCssStyles(cell, excelCell, workbook)

                    // Handle images
                    val Elements images = cell.select("img")
                    for (Element img : images) {
                        val String imgUrl = img.attr("src")
                        addImageToExcel(sheet, imgUrl, rowIndex - 1, cellIndex - 1, workbook)
                    }
                }
            }
        }

        // Create directories if they do not exist
        val File file = new File(excelFilePath)
        val File parentDir = file.getParentFile()
        if (parentDir !== null && !parentDir.exists()) {
            parentDir.mkdirs()
        }

        // Write the Excel file
        val FileOutputStream fileOut = new FileOutputStream(file)
        try {
            workbook.write(fileOut)
        } finally {
            workbook.close()
            fileOut.close()
        }
    }

    def applyCssStyles(Element htmlCell, Cell excelCell, Workbook workbook) {
        val cssClasses = htmlCell.classNames()
        val CellStyle cellStyle = workbook.createCellStyle()

        if (cssClasses.contains("bold")) {
            val Font font = workbook.createFont()
            font.setBold(true)
            cellStyle.setFont(font)
        }
        // Add more CSS handling here...

        excelCell.setCellStyle(cellStyle)
    }

    def addImageToExcel(Sheet sheet, String imgUrl, int rowIndex, int colIndex, Workbook workbook) throws IOException {
        val InputStream inputStream = new URL(imgUrl).openStream()
        val byte[] bytes = IOUtils.toByteArray(inputStream)
        val int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG)
        inputStream.close()

        val CreationHelper helper = workbook.getCreationHelper()
        val Drawing drawing = sheet.createDrawingPatriarch()
        val ClientAnchor anchor = helper.createClientAnchor()
        anchor.setCol1(colIndex)
        anchor.setRow1(rowIndex)

        val Picture pict = drawing.createPicture(anchor, pictureIdx)
        pict.resize()
    }
}