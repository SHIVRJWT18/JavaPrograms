package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class RemoveDublicateContentOfTwoFileAndUpdateNewFile 
{

	@Test
	public void RemoveDublicateContentInF4FromF2AndUpdateInNewFileF6() throws IOException
	{
	 PrintWriter p = new PrintWriter("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File6.txt")	;
	 BufferedReader br1 = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File4.txt"));
	 BufferedReader br2 = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File2.txt"));

	 String line1 = br1.readLine();	
	 while(line1!=null)
	 {
	  boolean flag = false;
	  String line2 = br2.readLine();	
	  while(line2!=null)
	  {
		if(line1.equalsIgnoreCase(line2))
		{
		 flag= true;
		 break;
		}
		line1 = br2.readLine();
	  }	 
	  if(flag==false)
	  {
		 p.println(line1);
	     line1 = br1.readLine();
	  }	  
	  p.flush();
	 }	 
	 p.close();
	 br1.close();
	 br2.close();
	
	}
}
