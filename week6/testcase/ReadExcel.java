package week5.day1.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Set the path of the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		//get into the specific sheet using index
		XSSFSheet wSheet = wb.getSheetAt(0);
		//Find the total number of rows
		int rowCount = wSheet.getLastRowNum();
		System.out.println(rowCount);
		//Find the total number of columns
		//get into the header row(0 index) and then get the last cell number
		int columnCount = wSheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		//To get a particular data use index
		XSSFCell cell = wSheet.getRow(2).getCell(3);
		//System.out.println(cell);
		//to get the entire data
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = wSheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
		}
		
		
		
		}
	

}
