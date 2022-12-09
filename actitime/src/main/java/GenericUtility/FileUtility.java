package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{	
	public String fetchDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fls = new FileInputStream("./src/test/resources/propertyData1.properties");
		Properties property = new Properties();
		property.load(fls);
		return property.getProperty(key);
				
	}
}
