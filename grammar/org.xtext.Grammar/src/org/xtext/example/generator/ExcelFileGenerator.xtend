package org.xtext.example.generator

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Cell
import org.xtext.example.myDsl.Document
import java.io.FileOutputStream

class ExcelFileGenerator {
	def generate(Document document, String fileName, String filePath, Context context1) {
        // Créer un nouveau classeur Excel
		val Workbook workbook = new XSSFWorkbook()

        // Ajouter une feuille au classeur
        val Sheet sheet = workbook.createSheet("Exemple Feuille")

        // Créer des données de démonstration 
        var data = #[
            #["Nom", "Prénom", "Email"],
            #["Doe", "John", "john.doe@example.com"],
            #["Doe", "Jane", "jane.doe@example.com"]
        ]

        // Remplir la feuille avec les données
        for (var i = 0; i < data.length; i++) {
            val Row row = sheet.createRow(i) // Créer une nouvelle ligne

            for (var j = 0; j < data.get(i).length; j++) {
                val Cell cell = row.createCell(j) // Créer une nouvelle cellule dans la ligne
                cell.setCellValue(data.get(i).get(j)) // Définir la valeur de la cellule
            }
        }

        // Écrire le classeur dans un fichier
        try (val outputStream = new FileOutputStream(filePath)) {
		    workbook.write(outputStream);
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    if (workbook !== null) {
		        workbook.close();
		    }
		}
	} 
}