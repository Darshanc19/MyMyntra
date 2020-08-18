package testngg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	@Test
	public void readData () throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\darsh\\OneDrive\\Desktop\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh =wb.getSheet("sheet1");
		XSSFRow row = sh.getRow(0);
		XSSFCell cell = row.getCell(0);
		String val = cell.getStringCellValue();
		System.out.println(val);
		wb.close();
		
	
	}

}
