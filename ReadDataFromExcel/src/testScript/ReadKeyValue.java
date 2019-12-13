package testScript;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Manjunath
 * 
 *
 */


public class ReadKeyValue 
{
	/**
	 * Developed By Mr. ABC and it is used to retrieve the Value associated with Key
	 * @param path
	 * @param key
	 * @return value
	 */
	
	public String getPropertyKeyValue(String path, String key)
	{
		FileInputStream ip = null;
		Properties prop = null;
		try 
		{
			ip = new FileInputStream(path);
			prop = new Properties();
			prop.load(ip);
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	

}
