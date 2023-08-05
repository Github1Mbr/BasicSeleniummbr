package Datadriventesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfilewrite 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Step 1: Open the document in Java Readable format
		FileInputStream fis = new FileInputStream("C:\\Users\\ELCOT\\Desktop\\Java selinem\\AutomationFramework2023\\src\\test\\resources\\TestData.xlsx");
		// Step 2: create a work book
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: navigate to sheet
		Sheet sh = wb.getSheet("Sheet1");
		// Create a new Sheet
		//Sheet cr1 = wb.createSheet("Sheet2");
		//Step 4: navigate to row
		Row rw = sh.createRow(5);
		//create 
		//Step 5: navigate to cell
		Cell cl = rw.createCell(6);//create
		
		//Step 6: set the data to be written
		cl.setCellValue("Qspiders");
		//setCellValue string 
		
		//Step 7: open the document in java write format
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ELCOT\\Desktop\\Java selinem\\AutomationFramework2023\\src\\test\\resources\\TestData.xlsx");
		
		wb.write(fos);
		System.out.println("data added");
		
	}

	
}
