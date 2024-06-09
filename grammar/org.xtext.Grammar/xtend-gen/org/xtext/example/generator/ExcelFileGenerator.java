package org.xtext.example.generator;

import java.io.FileOutputStream;
import java.util.Collections;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.example.myDsl.Document;

@SuppressWarnings("all")
public class ExcelFileGenerator {
  public void generate(final Document document, final String fileName, final String filePath, final Context context1) {
    try {
      final Workbook workbook = new XSSFWorkbook();
      final Sheet sheet = workbook.createSheet("Exemple Feuille");
      List<List<String>> data = Collections.<List<String>>unmodifiableList(CollectionLiterals.<List<String>>newArrayList(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Nom", "Prénom", "Email")), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Doe", "John", "john.doe@example.com")), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Doe", "Jane", "jane.doe@example.com"))));
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(data, Object.class)).length); i++) {
        {
          final Row row = sheet.createRow(i);
          for (int j = 0; (j < ((Object[])Conversions.unwrapArray(data.get(i), Object.class)).length); j++) {
            {
              final Cell cell = row.createCell(j);
              cell.setCellValue(data.get(i).get(j));
            }
          }
        }
      }
      try (final FileOutputStream outputStream = new Function0<FileOutputStream>() {
        @Override
        public FileOutputStream apply() {
          try {
            return new FileOutputStream(filePath);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      }.apply()) {
        workbook.write(outputStream);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        if ((workbook != null)) {
          workbook.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
