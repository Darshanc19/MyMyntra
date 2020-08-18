package testngg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Tryannotation {
	

	@Test
	public void readData () throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\darsh\\OneDrive\\Desktop\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sh =wb.getSheetAt(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		for (int i=0; i<rowCount; i++) {
			XSSFRow row = sh.getRow(i);
			short cellCount = row.getLastCellNum();
			for (int j=0; j<cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				try {
					System.out.println(cell.getStringCellValue());
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("empty cell");
				}
			}
		}
		
		
		wb.close();
		

}
}