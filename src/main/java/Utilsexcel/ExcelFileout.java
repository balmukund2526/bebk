package Utilsexcel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileout {

	public static void main(String[] args) throws IOException {
		String excelPath = "C:\\Users\\Lenovo\\eclipse-workspace\\Amzon\\exce\\Book111.xlsx";
		   FileInputStream excelFile = new FileInputStream(new File(excelPath));
           Workbook workbook = new XSSFWorkbook(excelFile);
           Sheet sheet = workbook.getSheetAt(0); // Assuming the first sheet


		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
//	    System.out.print(cell);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				}

				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
