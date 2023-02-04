package Web_Driver;

import java.io.FileInputStream;//Read
import java.io.FileOutputStream;//Write
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		FileInputStream fileinput = new FileInputStream("D://Selenium Class//Writedata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating cell Data "+
									sheet.getRow(2).getCell(1));
		//Write the data to excell file
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		fileinput.close();
		FileOutputStream fileout = new FileOutputStream("D://Selenium Class//Writedata.xlsx");
		workbook.write(fileout);
		System.out.println("Updated data after write is done "+cell.getStringCellValue());
		fileout.close();
	}
}
