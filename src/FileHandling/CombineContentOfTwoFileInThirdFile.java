package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class CombineContentOfTwoFileInThirdFile 
{
	//Here Given F1 and F2 files has content now has to combine in new File F3

	@Test(enabled =false)
	public void CombineContentOfF1_F2IntoF3File() throws IOException
	{
		PrintWriter p = new PrintWriter("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File3.txt");
		BufferedReader br = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File1.txt"));
		String l = br.readLine();
		while(l!=null)
		{
			p.println(l);
			l= br.readLine();
		}	
		br = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File2.txt"));
		l = br.readLine();
		while(l!=null)
		{
			p.println(l);
			l= br.readLine();
		}	
		p.flush();
		br.close();
		p.close();
	}
	
	@Test(enabled =false)
	public void CombineContentOfF1_F2AlternativelyLineByLineIntoF4File() throws IOException
	{
	 PrintWriter p = new PrintWriter("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File4.txt");
	 BufferedReader br1 = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File1.txt"));
	 BufferedReader br2 = new BufferedReader(new FileReader("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File2.txt"));

	 String line1 = br1.readLine();	
	 String line2 = br2.readLine();	
	 while(line1!=null ||line2!=null)
	 {
		 if(line1!=null)
		 {
			 p.println(line1);
			 line1 =br1.readLine();
		 }
		 if(line2!=null)
		 {
		   p.println(line2);
		   line2 = br2.readLine();
		 }	 
	 }	
	 p.flush();
	 p.close();
	 br1.close();
	 br2.close();
	}
	
	@Test
	public void MergeAllDataIntoNewFile5() throws IOException
	{
	  PrintWriter p = new PrintWriter("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1\\File5.txt");
	  File f = new File("F:\\SHIV NEWSCRIPTS\\JavaProject\\LocalFolder\\Prog1");
	  String[] str = f.list();
	  for(String f1:str)
	  {
	    BufferedReader br = new BufferedReader(new FileReader(new File(f,f1)));
        String line = br.readLine();
        while(line!=null)
        {
        	p.println(line);
        	line = br.readLine();
        }	
        br.close();
	  }
       p.flush();
       p.close();
       
	  }	  

	
}
