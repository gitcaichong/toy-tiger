package com.yaya.toytiger.controller;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@RestController
@RequestMapping(value = "/excel")
public class ExcelController {

	//创建表头
	private void createTitle(XSSFWorkbook workbook, XSSFSheet sheet){
		XSSFRow row = sheet.createRow(0);
		//设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
		sheet.setColumnWidth(1,12*256);
		sheet.setColumnWidth(3,17*256);

		//设置为居中加粗
		XSSFCellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
//		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setFont(font);

		XSSFCell cell;
		cell = row.createCell(0);
		cell.setCellValue("ID");
		cell.setCellStyle(style);


		cell = row.createCell(1);
		cell.setCellValue("显示名");
		cell.setCellStyle(style);

		cell = row.createCell(2);
		cell.setCellValue("用户名");
		cell.setCellStyle(style);

		cell = row.createCell(3);
		cell.setCellValue("创建时间");
		cell.setCellStyle(style);
	}

	//生成user表excel
	@GetMapping(value = "/getUser")
	public String getUser(HttpServletResponse response) throws Exception{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("统计表");
		createTitle(workbook,sheet);
		String fileName = "导出excel例子.xlsx";

		//生成excel文件
		buildExcelFile(fileName, workbook);

		//浏览器下载excel
		buildExcelDocument(fileName,workbook,response);

		return "download excel";
	}

	//生成excel文件
	protected void buildExcelFile(String filename,XSSFWorkbook workbook) throws Exception{
		FileOutputStream fos = new FileOutputStream(filename);
		workbook.write(fos);
		fos.flush();
		fos.close();
	}

	//浏览器下载excel
	protected void buildExcelDocument(String filename,XSSFWorkbook workbook,HttpServletResponse response) throws Exception{
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "utf-8"));
		OutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		outputStream.flush();
		outputStream.close();
	}
}
