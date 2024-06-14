package org.xtext.example.generator

//import com.lowagie.text.DocumentException
import org.htmlcleaner.CleanerProperties
import org.htmlcleaner.HtmlCleaner
import org.htmlcleaner.PrettyHtmlSerializer
import org.xhtmlrenderer.pdf.ITextRenderer

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.StringWriter

class PdfFileGenerator {
    private Context context1
    private HtmlCodeGenerator seqgeneratorHtml

    // Constructeur pour initialiser context1
    new(Context context) {
        this.context1 = context
        this.seqgeneratorHtml = new HtmlCodeGenerator(this.context1)
    }

    def generatePdfFromHtml(String htmlContent, String pdfFilePath) {
        try {
            // Créez le répertoire si nécessaire
            val file = new File(pdfFilePath)
            val parentDir = file.getParentFile()
            if (parentDir !== null && !parentDir.exists()) {
                parentDir.mkdirs()
            }

            // Utiliser HtmlCleaner pour nettoyer et formater le HTML
            val cleanedHtml = cleanHtml(htmlContent)

            // Convertir HTML en PDF avec Flying Saucer
            val renderer = new ITextRenderer()
            renderer.setDocumentFromString(cleanedHtml)
            renderer.layout()

            val fos = new FileOutputStream(file)
            try {
                renderer.createPDF(fos)
            } finally {
                fos.close()
            }

            println("PDF created successfully!")

        } catch (IOException e) {
            e.printStackTrace()
        }
    }

    private def String cleanHtml(String htmlContent) {
        val cleanerProperties = new CleanerProperties()
        val cleaner = new HtmlCleaner(cleanerProperties)
        val rootNode = cleaner.clean(htmlContent)
        val serializer = new PrettyHtmlSerializer(cleanerProperties)
        val writer = new StringWriter()
        serializer.write(rootNode, writer, "UTF-8")
        return writer.toString()
    }

    def generate(String htmlContent, String fileName) {
        generatePdfFromHtml(htmlContent, fileName)
    }
}