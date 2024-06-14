package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWriterAndReaderDemo 
{
@Test(enabled = false)
public void FileWriterDemo() throws IOException
{
 File f = new File("LocalFolder","abc.txt");
 f.createNewFile();
 FileWriter fw = new FileWriter(f);
 fw.write(123);// print unicode value
 fw.write("\n");
 fw.write('c');
 fw.write("\n");
 fw.write("Hello World");
 fw.write("\n");
 char[] ch = {'a','e','i','o','u'};
 fw.write(ch);
 fw.write("\n");
 fw.flush();
 fw.close();
}
@Test
public void FileReaderWay1Demo() throws IOException
{
	File f = new File("LocalFolder","abc.txt");
	FileReader fr = new FileReader(f);
	char[] ch = new char[(int)f.length()];
	fr.read(ch);
	for(char c:ch)
	{
	 System.out.println(c);	
	}	
	fr.close();
}
@Test
public void FileReaderWay2Demo() throws IOException
{
	File f = new File("LocalFolder","abc.txt");
	FileReader fr = new FileReader(f);
	int i = fr.read();
	while(i!=-1)
	{
	 System.out.println((char)i);
	 i = fr.read();
	}	
    fr.close();
}
}
