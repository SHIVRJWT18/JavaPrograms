package CollectionFrmwrk.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class IteratorDemo {

	// It is a universal cursor for any collection and have remove method also
	@Test
	public void GetElementMultipleOf4()
	{
	 ArrayList<Integer> a = new ArrayList<Integer>();
	 for(int i =0;i<=30;i++)
	 {
	  a.add(i);	 
	 }	 
	 System.out.println("Before Elements: "+a);
	
	Iterator itre = a.iterator();
	while(itre.hasNext())
	{
	 Integer in = (Integer)itre.next();
	 
	 if(in%4==0)
	 {
	  System.out.println("Element are: "+in);
	 }
	 else
	 {
	  itre.remove();	 
	  System.out.println("Removed Element: "+in);	 
	 }	 
	}  

	System.out.println("Final List: "+a);
	
	}
}
