package com.example.demo.config;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

public class POIExcel {
	public void excelPOI() {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("table");  //创建table工作薄
		Object[][] datas = {{"区域", "总销售额(万元)", "总利润(万元)简单的表格"}, {"江苏省" , 9045,  2256}, {"广东省", 3000, 690}};
		HSSFRow row;
		HSSFCell cell;
		for(int i = 0; i < datas.length; i++) {
		    row = sheet.createRow(i);//创建表格行
		    for(int j = 0; j < datas[i].length; j++) {
		        cell = row.createCell(j);//根据表格行创建单元格
		        cell.setCellValue(String.valueOf(datas[i][j]));
		    }
		}
		try {
			wb.write(new FileOutputStream("C:\\Users\\dell\\Desktop\\table.xls"));//存放位置
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
