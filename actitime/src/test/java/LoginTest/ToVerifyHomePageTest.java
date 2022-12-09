package LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class ToVerifyHomePageTest extends BaseClass 
{
	@Test
	public void toVerifyHomePageTest() throws EncryptedDocumentException, IOException
	{
		String expectedTitle = eutils.fetchDataFromExcelFile("actiTime", 1, 3);
		
		wutils.waitForTitle(driver, "Enter");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		

		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified.");
	}
}
