package FileHandling;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileDemo 
{

@Test(enabled = false)
	public void FileExistsDemo() throws IOException
	{
		File f = new File("abc.txt"); 
		System.out.println(f.exists());
		f.createNewFile();  // File 
		System.out.println(f.exists());
		
		File f1 = new File("LocalFolder");
		System.out.println(f1.exists());
		f1.mkdir();   //folder
		System.out.println(f1.exists());
	}
@Test(enabled = false)
    public void CreateFile() throws IOException
    {
	 File f = new File("def.txt"); // Current Folder
	 f.createNewFile();
	 System.out.println(f.exists());
	 File f1 = new File("LocalFolder","ghi.txt");
	 f1.createNewFile();
	 File f2 = new File("E:\\SHIV STUDY","jkl.txt");
	 f2.createNewFile();
    }
@Test(enabled = false)
     public void GetFilesandFolder()
     {
	  int count =0;
	  File f = new File("E:\\SHIV STUDY");
	  String[] st = f.list();
	  for(String s:st)
	  {
		System.out.println(s); 
		count++;
	  }	  
	  System.out.println(count);
     }
@Test
     public void GetFilesOnly()
     {
      int count= 0;
      File f = new File("E:\\SHIV STUDY\\My Resumes");
      String[] st = f.list();
      for(String s :st)
      {
       File f1 = new File(f,s);	
       if(f1.isFile())
       {
    	   System.out.println(s);
    	   count++;
       }
       
      }
      System.out.println("File Count: "+count);
     }

@Test
    public void GetfolderOnly()
    {
	int count =0;
	File f = new File("E:\\SHIV STUDY\\My Resumes");
	String[] st = f.list();
	for(String s:st)
	{
	 File f1 = new File(f,s);
	 if(f1.isDirectory())
	 {
		 System.out.println(s);
		 count++;
	 }	 
	}	
	System.out.println("Folder Count: "+count);
    }
}	
				

