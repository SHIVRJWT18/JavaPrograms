package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class PrintWriterDemo {

	@Test
	public void UsePrintWriterDemo() throws IOException
	{
		File f = new File("LocalFolder","jkl.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter p = new PrintWriter(fw);
		p.write("This is example of Print Writer");
	    char[] ch = {'A','F','E','R'};
	    p.write(ch);
	    p.println("Hello World");
	    p.println(120);
	    p.println("complete my Print writing");
	    p.print("*");
	    p.print("*");
	    p.print("*");
	    p.print("*");     // append in same line
	    p.println("");
	    p.println("@");  // ln is used for next line
	    p.println("@");
	    p.println("@");
	    p.println("@");
	    p.flush();
	    p.close();
	}
}
