package org.xtext.example.generator

import org.apache.poi.util.Units
import org.apache.poi.xwpf.usermodel.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URL

class DocxFileGenerator {
    private Context context1
    private HtmlCodeGenerator seqgeneratorHtml

    // Constructeur pour initialiser context1
    new(Context context) {
        this.context1 = context
        this.seqgeneratorHtml = new HtmlCodeGenerator(this.context1)
    }

    def generateWordFromHtml(String htmlContent, String wordFilePath) throws IOException {
        // Create a new Word document
        val document = new XWPFDocument()

        // Parse HTML content
        val htmlDoc = Jsoup.parse(htmlContent)
        val body = htmlDoc.body()

        // Convert HTML to Word document
        parseElement(body, document)

        // Create directories if they do not exist
        val file = new File(wordFilePath)
        val parentDir = file.getParentFile()
        if (parentDir !== null && !parentDir.exists()) {
            parentDir.mkdirs()
        }

        // Write the Word document
        val fileOut = new FileOutputStream(file)
        try {
            document.write(fileOut)
        } finally {
            fileOut.close()
            document.close()
        }

        println("Word document created successfully!")
    }

    def parseTable(Element table, XWPFDocument document) {
        val xwpfTable = document.createTable()
        val rows = table.select("tr")
        for (rowElement : rows) {
            val xwpfRow = xwpfTable.createRow()
            val cells = rowElement.select("th, td")
            for (cellElement : cells) {
                val xwpfCell = xwpfRow.addNewTableCell()
                xwpfCell.setText(cellElement.text)
            }
        }
    }

    def addImageToWord(XWPFDocument document, Element imgElement) {
        val imgUrl = imgElement.attr("src")
        try {
            val url = new URL(imgUrl)
            val inputStream = url.openStream
            val run = document.createParagraph.createRun
            run.addPicture(inputStream, XWPFDocument.PICTURE_TYPE_PNG, imgUrl, Units.toEMU(200), Units.toEMU(200)) // Adjust size as needed
            inputStream.close()
        } catch (Exception e) {
            e.printStackTrace
        }
    }

    def applyStyles(Element element, XWPFRun run) {
        val classes = element.classNames
        if (classes.contains("bold")) {
            run.setBold(true)
        }
        if (classes.contains("italic")) {
            run.setItalic(true)
        }
        // Add more styles handling here...
    }

    def parseElement(Element element, XWPFDocument document) {
        for (child : element.children) {
            switch child.tagName {
                case "p": {
                    val paragraph = document.createParagraph
                    val run = paragraph.createRun
                    run.setText(child.text)
                    applyStyles(child, run)
                }
                case "h1": {
                    val h1 = document.createParagraph
                    h1.setStyle("Heading1")
                    val h1Run = h1.createRun
                    h1Run.setText(child.text)
                    applyStyles(child, h1Run)
                }
                case "h2": {
                    val h2 = document.createParagraph
                    h2.setStyle("Heading2")
                    val h2Run = h2.createRun
                    h2Run.setText(child.text)
                    applyStyles(child, h2Run)
                }
                case "ul": {
                    for (li : child.select("li")) {
                        val ulParagraph = document.createParagraph
                        val ulRun = ulParagraph.createRun
                        ulRun.setText("• " + li.text)
                        applyStyles(li, ulRun)
                    }
                }
                case "table": {
                    parseTable(child, document)
                }
                case "img": {
                    addImageToWord(document, child)
                }
                /*case "div", "span": {
                    parseElement(child, document)
                }*/
                default: {
                    // Handle other tags if needed
                }
            }
        }
    }

    def generate(String htmlContent, String fileName) {
        try {
            generateWordFromHtml(htmlContent, fileName)
        } catch (IOException e) {
            e.printStackTrace
        }
    }
}