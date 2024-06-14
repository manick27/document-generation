package org.xtext.example.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyHtmlSerializer;
import org.htmlcleaner.TagNode;
import org.xhtmlrenderer.pdf.ITextRenderer;

@SuppressWarnings("all")
public class PdfFileGenerator {
  private Context context1;

  private HtmlCodeGenerator seqgeneratorHtml;

  public PdfFileGenerator(final Context context) {
    this.context1 = context;
    HtmlCodeGenerator _htmlCodeGenerator = new HtmlCodeGenerator(this.context1);
    this.seqgeneratorHtml = _htmlCodeGenerator;
  }

  public String generatePdfFromHtml(final String htmlContent, final String pdfFilePath) {
    try {
      String _xtrycatchfinallyexpression = null;
      try {
        String _xblockexpression = null;
        {
          final File file = new File(pdfFilePath);
          final File parentDir = file.getParentFile();
          if (((parentDir != null) && (!parentDir.exists()))) {
            parentDir.mkdirs();
          }
          final String cleanedHtml = this.cleanHtml(htmlContent);
          final ITextRenderer renderer = new ITextRenderer();
          renderer.setDocumentFromString(cleanedHtml);
          renderer.layout();
          final FileOutputStream fos = new FileOutputStream(file);
          try {
            renderer.createPDF(fos);
          } finally {
            fos.close();
          }
          _xblockexpression = InputOutput.<String>println("PDF created successfully!");
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return _xtrycatchfinallyexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private String cleanHtml(final String htmlContent) {
    try {
      final CleanerProperties cleanerProperties = new CleanerProperties();
      final HtmlCleaner cleaner = new HtmlCleaner(cleanerProperties);
      final TagNode rootNode = cleaner.clean(htmlContent);
      final PrettyHtmlSerializer serializer = new PrettyHtmlSerializer(cleanerProperties);
      final StringWriter writer = new StringWriter();
      serializer.write(rootNode, writer, "UTF-8");
      return writer.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String generate(final String htmlContent, final String fileName) {
    return this.generatePdfFromHtml(htmlContent, fileName);
  }
}
