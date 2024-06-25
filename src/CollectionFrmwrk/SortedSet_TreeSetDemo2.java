package CollectionFrmwrk;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedSet_TreeSetDemo2 {

	/* Homogenous element allowed for Tree Set and TreeMap  still get RE Class Caste Exception
	   NOTE:- String Buffer and String Builder is not implement Comparable interface upto JDK 6 but 
	   now JDK 11 on wards its also implements comparable 
    */
	@Test
	public void GetDefaultNaturalSortingDemo()
	{
		TreeSet<StringBuffer> ts1 = new TreeSet<StringBuffer>();  
		ts1.add(new StringBuffer("Matri"));
		ts1.add(new StringBuffer("Deeksha"));
		ts1.add(new StringBuffer("Suneeti"));
		ts1.add(new StringBuffer("Abhilasha"));
		
		TreeSet<StringBuilder> ts2 = new TreeSet<StringBuilder>();  
		ts2.add(new StringBuilder("Ram"));
		ts2.add(new StringBuilder("Shyam"));
		ts2.add(new StringBuilder("Mayank"));
		ts2.add(new StringBuilder("Vashu"));
	
	    System.out.println("TreeSet for StringBuffer Object: "+ts1); 
	    System.out.println("TreeSet for StringBuilder Object: "+ts2); 
	    
 
	}
}
