package com.quickbook.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellLib {
     
	String Filepath="/Users/troutray/eclipse-workspace/IntuitQuickbooks/TestdataIntuit/Testdataquickbooks.xlsx";
	public String getExcellData (String sheetName,int Rownum,int Colnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream(Filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.getRow(Rownum);
	String data=row.getCell(Colnum).getStringCellValue();
	return data;
		
	}
	
	public void setexcellData(String sheetName,int Rownum,int Colnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(Filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(Rownum);
		Cell cel=row.createCell(Colnum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(Filepath);
		wb.write(fos);
		wb.close();
		
	}
	

}


