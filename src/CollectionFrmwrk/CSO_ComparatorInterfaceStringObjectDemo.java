package CollectionFrmwrk;

import java.util.Comparator;
import java.util.TreeSet;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSO_ComparatorInterfaceStringObjectDemo {
	
	
	@Test
	public void GetCustomSortingStringObjectWithComparator()
	{
		TreeSet<String> ts = new TreeSet<String>(new CustomStringComparator());
		ts.add("Rakesh");     
		ts.add("Rinku");    
		ts.add("Sonu");     
		ts.add("Tannu"); 
		ts.add("Rajendra");
		ts.add("Mannu");
		
		System.out.println("CSO TreeSet String Objects: "+ts);		
	}
	
	@Test
	public void GetCustomSortingStringBufferObjectWithComparator()
	{
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(new CustomStringBufferComparator());
		ts.add(new StringBuffer("PRYJ"));     
		ts.add(new StringBuffer("SFG"));  
		ts.add(new StringBuffer("ETW"));  
		ts.add(new StringBuffer("BSBS"));  
		ts.add(new StringBuffer("CNB"));  
		
		System.out.println("CSO TreeSet StringBuffer Objects: "+ts);		
	}
}


class CustomStringComparator implements Comparator<Object>
{
	
	public int compare(Object o1,Object o2)
	{
	 String  s1 = (String)o1;
	 String s2 = o2.toString();
	// return s1.compareTo(s2);   // Alphabetic Sorting
	// return s2.compareTo(s1);    // Reverse of Alphabetic Sorting
	 return -s1.compareTo(s2);   // Reverse of Alphabetic Sorting
	//  return -s2.compareTo(s1);   // Alphabetic Sorting
	}	
}

class CustomStringBufferComparator implements Comparator<Object>
{
	
	public int compare(Object o1,Object o2)
	{
	 String  s1 = o1.toString();
	 String s2 = o2.toString();
	// return s1.compareTo(s2);   // Alphabetic Sorting
	// return s2.compareTo(s1);    // Reverse of Alphabetic Sorting
	 return -s1.compareTo(s2);   // Reverse of Alphabetic Sorting
	//  return -s2.compareTo(s1);   // Alphabetic Sorting
	}	
}
