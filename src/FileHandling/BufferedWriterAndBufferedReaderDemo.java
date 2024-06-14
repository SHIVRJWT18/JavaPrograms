package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class BufferedWriterAndBufferedReaderDemo 
{

	@Test
	public void BufferedWriterDemo() throws IOException
	{
		File f = new File("LocalFolder","def.txt");
	    FileWriter fw = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(fw);
	    char[] ch = {'s','d','f','t'};
	    bw.write(ch);
	    bw.newLine();    // This method not available in File Writer
	    bw.write("This is example of Buffered Reader");
	    bw.newLine();
	    bw.write(120);
	    bw.newLine();    
	    bw.write("complete my writing");
	    bw.flush();
	    bw.close();
	    
	}
	
	@Test
	public void BufferedReaderDemo() throws IOException
	{
		File f = new File("LocalFolder","def.txt");
	    FileReader fw = new FileReader(f);
	    BufferedReader br = new BufferedReader(fw);
	    String line = br.readLine();   //    This method not available in File Reader
	    while(line!=null)
	    {
	     System.out.println(line);
	     line = br.readLine();
	    }
	    
	    br.close();
	}
}
