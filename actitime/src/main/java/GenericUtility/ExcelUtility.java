package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String fetchDataFromExcelFile(String sheetname, int row, int colon) throws EncryptedDocumentException, IOException
	{
		FileInputStream fls1 = new FileInputStream("./src/test/resources/excelData1.xlsx");
		Workbook workbook = WorkbookFactory.create(fls1);
		return workbook.getSheet(sheetname).getRow(row).getCell(colon).toString();
	}
}
