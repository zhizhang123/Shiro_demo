package com.example.demo;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.POIExcel;

@SpringBootApplication
public class ShiroDemoApplication {

	public static void main(String[] args) {
		POIExcel h=new POIExcel();
		h.excelPOI();
		SpringApplication.run(ShiroDemoApplication.class, args);
		System.out.println("========================启动成功=========================");
	}	
}
