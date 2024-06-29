package Maps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileDemo {

	
	@Test
	public void GetProperties() throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("F:\\SHIV NEWSCRIPTS\\JavaProject\\src\\Maps\\abc.txt");
		p.load(fis);
		System.out.println(p);
		
		p.setProperty("Usertype", "Employee");
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("F:\\SHIV NEWSCRIPTS\\JavaProject\\src\\Maps\\abc.txt");
		p.store(fos, "Updated by Administrator");
	}

	
}
