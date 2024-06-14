package org.xtext.example.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@SuppressWarnings("all")
public class ExcelFileGenerator {
  private Context context1;

  private HtmlCodeGenerator seqgeneratorHtml;

  public ExcelFileGenerator(final Context context) {
    this.context1 = context;
    HtmlCodeGenerator _htmlCodeGenerator = new HtmlCodeGenerator(this.context1);
    this.seqgeneratorHtml = _htmlCodeGenerator;
  }

  public void generate(final String htmlCode, final String fileName) {
    try {
      this.convertHtmlToExcel(htmlCode, fileName);
      System.out.println("Excel file created successfully!");
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public void convertHtmlToExcel(final String htmlContent, final String excelFilePath) throws IOException {
    final Document htmlDoc = Jsoup.parse(htmlContent);
    final Workbook workbook = new XSSFWorkbook();
    final Elements tables = htmlDoc.select("table");
    int tableIndex = 1;
    for (final Element table : tables) {
      {
        int _plusPlus = tableIndex++;
        String _plus = ("Sheet" + Integer.valueOf(_plusPlus));
        final Sheet sheet = workbook.createSheet(_plus);
        final Elements rows = table.select("tr");
        int rowIndex = 0;
        for (final Element row : rows) {
          {
            int _plusPlus_1 = rowIndex++;
            final Row excelRow = sheet.createRow(_plusPlus_1);
            final Elements cells = row.select("th, td");
            int cellIndex = 0;
            for (final Element cell : cells) {
              {
                int _plusPlus_2 = cellIndex++;
                final Cell excelCell = excelRow.createCell(_plusPlus_2);
                excelCell.setCellValue(cell.text());
                this.applyCssStyles(cell, excelCell, workbook);
                final Elements images = cell.select("img");
                for (final Element img : images) {
                  {
                    final String imgUrl = img.attr("src");
                    this.addImageToExcel(sheet, imgUrl, (rowIndex - 1), (cellIndex - 1), workbook);
                  }
                }
              }
            }
          }
        }
      }
    }
    final File file = new File(excelFilePath);
    final File parentDir = file.getParentFile();
    if (((parentDir != null) && (!parentDir.exists()))) {
      parentDir.mkdirs();
    }
    final FileOutputStream fileOut = new FileOutputStream(file);
    try {
      workbook.write(fileOut);
    } finally {
      workbook.close();
      fileOut.close();
    }
  }

  public void applyCssStyles(final Element htmlCell, final Cell excelCell, final Workbook workbook) {
    final Set<String> cssClasses = htmlCell.classNames();
    final CellStyle cellStyle = workbook.createCellStyle();
    boolean _contains = cssClasses.contains("bold");
    if (_contains) {
      final Font font = workbook.createFont();
      font.setBold(true);
      cellStyle.setFont(font);
    }
    excelCell.setCellStyle(cellStyle);
  }

  public void addImageToExcel(final Sheet sheet, final String imgUrl, final int rowIndex, final int colIndex, final Workbook workbook) throws IOException {
    final InputStream inputStream = new URL(imgUrl).openStream();
    final byte[] bytes = IOUtils.toByteArray(inputStream);
    final int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
    inputStream.close();
    final CreationHelper helper = workbook.getCreationHelper();
    final Drawing drawing = sheet.createDrawingPatriarch();
    final ClientAnchor anchor = helper.createClientAnchor();
    anchor.setCol1(colIndex);
    anchor.setRow1(rowIndex);
    final Picture pict = drawing.createPicture(anchor, pictureIdx);
    pict.resize();
  }
}
