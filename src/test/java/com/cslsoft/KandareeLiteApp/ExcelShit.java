package com.cslsoft.KandareeLiteApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelShit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String values=setStrDate("hello",1,5);
		System.out.println(values);

	}
	public static String setStrDate(String Sdata,int rowN,int cellN) throws IOException
	{
		File appDir = new File("src/test/resources");
		File datafile = new File(appDir, "data.xlsx");
		FileInputStream Dfile=new FileInputStream(datafile);
		
		XSSFWorkbook wb=new XSSFWorkbook(Dfile);
		XSSFSheet sheet=wb.getSheet("Test1");
		XSSFRow row=sheet.getRow(rowN);
		if(row==null)
			row=sheet.createRow(rowN);
		
		XSSFCell cell=row.getCell(cellN);
		if(cell==null)
			cell=row.createCell(cellN);

		cell.setCellValue(Sdata);
		String data = cell.getStringCellValue();
		FileOutputStream fos = new FileOutputStream(datafile);
		wb.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		return data;
		
	}
	
	public static int setIntDate(int Idata,int rowN,int cellN) throws IOException
	{
		File appDir = new File("src/test/resources");
		File datafile = new File(appDir, "data.xlsx");
		FileInputStream Dfile=new FileInputStream(datafile);
		
		XSSFWorkbook wb=new XSSFWorkbook(Dfile);
		XSSFSheet sheet=wb.getSheet("Test1");
		XSSFRow row=sheet.getRow(rowN);
		if(row==null)
			row=sheet.createRow(rowN);
		
		XSSFCell cell=row.getCell(cellN);
		if(cell==null)
			cell=row.createCell(cellN);

		cell.setCellValue(Idata);
		int data = (int) cell.getNumericCellValue();
		FileOutputStream fos = new FileOutputStream(datafile);
		wb.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		return data;
		
	}
	public static String getstring(int rowN,int cellN) throws IOException
	{
		File appDir = new File("src/test/resources");
		File datafile = new File(appDir, "data.xlsx");
		FileInputStream Dfile=new FileInputStream(datafile);
		
		XSSFWorkbook wb=new XSSFWorkbook(Dfile);
		XSSFSheet sheet=wb.getSheet("Test1");
		XSSFRow row=sheet.getRow(rowN);
		if(row==null)
			row=sheet.createRow(rowN);
		
		XSSFCell cell=row.getCell(cellN);
		if(cell==null)
			cell=row.createCell(cellN);
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	public static int getinteger(int rowN,int cellN) throws IOException
	{
		File appDir = new File("src/test/resources");
		File datafile = new File(appDir, "data.xlsx");
		FileInputStream Dfile=new FileInputStream(datafile);
		
		XSSFWorkbook wb=new XSSFWorkbook(Dfile);
		XSSFSheet sheet=wb.getSheet("Test1");
		XSSFRow row=sheet.getRow(rowN);
		if(row==null)
			row=sheet.createRow(rowN);
		
		XSSFCell cell=row.getCell(cellN);
		if(cell==null)
			cell=row.createCell(cellN);
		int data = (int) cell.getNumericCellValue();
		return data;
		
	}

	

}
