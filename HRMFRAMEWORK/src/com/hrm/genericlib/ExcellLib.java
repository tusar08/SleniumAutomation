package com.hrm.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellLib {

	
String Filepath="C:\\Users\\TUSkY\\WebDriver\\HRMFRAMEWORK\\testdata\\testdata.xlsx";
public String getExcellData(String sheetName,int rowNum,int colNum)throws EncryptedDocumentException, InvalidFormatException, IOException{
FileInputStream fis=new FileInputStream(Filepath);
Workbook wb= WorkbookFactory.create(fis);
Sheet sh=wb.getSheet(sheetName);
Row row=sh.getRow(rowNum);
String data=row.getCell(colNum).getStringCellValue();
return data;
}

public void setExcellData(String sheetName,int rowNum,int colNum, String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
	FileInputStream fis=new FileInputStream(Filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.getRow(rowNum);
	Cell cel=row.createCell(colNum);
	cel.setCellType(cel.CELL_TYPE_STRING);
	cel.setCellValue(data);
	FileOutputStream fos=new FileOutputStream(Filepath);
	wb.write(fos);
	wb.close();
	
	
}










	

}

