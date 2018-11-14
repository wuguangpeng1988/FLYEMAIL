package main;

import java.io.File;

import h2o.common.Tools;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class readExcel {

//	 String sourceFile ="E:\\test\\mail\\file\\test.xls"; // 源文件
	String name = ""; 

	public String readExcelCount() {
		try {
			Workbook book = Workbook.getWorkbook(new File(CONSTANTS.CONTANT.MAILEXCEL));
			 WritableWorkbook wbook = Workbook.createWorkbook(new File(CONSTANTS.CONTANT.MAILEXCEL), book);//  
              WritableSheet sheet  =  (WritableSheet) wbook.getSheet( 0 );  

//			Sheet sheet = book.getSheet(0);
			int rows = sheet.getRows();
//			if (num < rows) {
//				name = sheet.getCell(0, num).getContents();
//				num++;
//				if (num == rows) {
//					Tools.log.info("所有邮件已经发送完毕");
//				}
//			}
			if(rows>0){
				name = sheet.getCell(0, 0).getContents();
				sheet.removeRow(0);
			}else if(rows==0){
				Tools.log.info("所有邮件已经发送完毕");
			}
			 wbook.write();  
		     wbook.close();  
			 book.close();  


		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;

	}
	
}
