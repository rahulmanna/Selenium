package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Spring;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class util 
{
	
	public static void fetchdata() throws IOException 
	{
		
		int row=0;
		int col=0;
		
		FileInputStream file=new FileInputStream("C:\\Rahul\\Selenium Learning 2022\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("testdata");
		int totalrows=(sheet.getLastRowNum()-sheet.getFirstRowNum());
		List<String> list=new ArrayList<String>();
		for(row=2;row<=totalrows;row++)
		{
			XSSFRow rows=sheet.getRow(row);
		   for (col=1;col<=rows.getLastCellNum();col++)
		   {
			   
			  list.add(sheet.getRow(row).getCell(col).getStringCellValue());
		      
		   }
		     
		}
	}

}
