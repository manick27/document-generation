package org.xtext.example.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@SuppressWarnings("all")
public class DocxFileGenerator {
  private Context context1;

  private HtmlCodeGenerator seqgeneratorHtml;

  public DocxFileGenerator(final Context context) {
    this.context1 = context;
    HtmlCodeGenerator _htmlCodeGenerator = new HtmlCodeGenerator(this.context1);
    this.seqgeneratorHtml = _htmlCodeGenerator;
  }

  public String generateWordFromHtml(final String htmlContent, final String wordFilePath) throws IOException {
    String _xblockexpression = null;
    {
      final XWPFDocument document = new XWPFDocument();
      final Document htmlDoc = Jsoup.parse(htmlContent);
      final Element body = htmlDoc.body();
      this.parseElement(body, document);
      final File file = new File(wordFilePath);
      final File parentDir = file.getParentFile();
      if (((parentDir != null) && (!parentDir.exists()))) {
        parentDir.mkdirs();
      }
      final FileOutputStream fileOut = new FileOutputStream(file);
      try {
        document.write(fileOut);
      } finally {
        fileOut.close();
        document.close();
      }
      _xblockexpression = InputOutput.<String>println("Word document created successfully!");
    }
    return _xblockexpression;
  }

  public void parseTable(final Element table, final XWPFDocument document) {
    final XWPFTable xwpfTable = document.createTable();
    final Elements rows = table.select("tr");
    for (final Element rowElement : rows) {
      {
        final XWPFTableRow xwpfRow = xwpfTable.createRow();
        final Elements cells = rowElement.select("th, td");
        for (final Element cellElement : cells) {
          {
            final XWPFTableCell xwpfCell = xwpfRow.addNewTableCell();
            xwpfCell.setText(cellElement.text());
          }
        }
      }
    }
  }

  public void addImageToWord(final XWPFDocument document, final Element imgElement) {
    final String imgUrl = imgElement.attr("src");
    try {
      final URL url = new URL(imgUrl);
      final InputStream inputStream = url.openStream();
      final XWPFRun run = document.createParagraph().createRun();
      run.addPicture(inputStream, XWPFDocument.PICTURE_TYPE_PNG, imgUrl, Units.toEMU(200), Units.toEMU(200));
      inputStream.close();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public void applyStyles(final Element element, final XWPFRun run) {
    final Set<String> classes = element.classNames();
    boolean _contains = classes.contains("bold");
    if (_contains) {
      run.setBold(true);
    }
    boolean _contains_1 = classes.contains("italic");
    if (_contains_1) {
      run.setItalic(true);
    }
  }

  public void parseElement(final Element element, final XWPFDocument document) {
    Elements _children = element.children();
    for (final Element child : _children) {
      String _tagName = child.tagName();
      if (_tagName != null) {
        switch (_tagName) {
          case "p":
            final XWPFParagraph paragraph = document.createParagraph();
            final XWPFRun run = paragraph.createRun();
            run.setText(child.text());
            this.applyStyles(child, run);
            break;
          case "h1":
            final XWPFParagraph h1 = document.createParagraph();
            h1.setStyle("Heading1");
            final XWPFRun h1Run = h1.createRun();
            h1Run.setText(child.text());
            this.applyStyles(child, h1Run);
            break;
          case "h2":
            final XWPFParagraph h2 = document.createParagraph();
            h2.setStyle("Heading2");
            final XWPFRun h2Run = h2.createRun();
            h2Run.setText(child.text());
            this.applyStyles(child, h2Run);
            break;
          case "ul":
            Elements _select = child.select("li");
            for (final Element li : _select) {
              {
                final XWPFParagraph ulParagraph = document.createParagraph();
                final XWPFRun ulRun = ulParagraph.createRun();
                String _text = li.text();
                String _plus = ("• " + _text);
                ulRun.setText(_plus);
                this.applyStyles(li, ulRun);
              }
            }
            break;
          case "table":
            this.parseTable(child, document);
            break;
          case "img":
            this.addImageToWord(document, child);
            break;
          default:
            break;
        }
      } else {
      }
    }
  }

  public String generate(final String htmlContent, final String fileName) {
    String _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.generateWordFromHtml(htmlContent, fileName);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
