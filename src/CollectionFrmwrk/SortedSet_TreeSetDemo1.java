package CollectionFrmwrk;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedSet_TreeSetDemo1 {

	// SortedSet is applicable for class object that implementing SortedSet i.e Tree Set
	// Homogenous element allowed for Tree Set and TreeMap 
	@Test
	public void GetDefaultNaturalSortingDemo()
	{
		TreeSet<String> ts = new TreeSet<String>();  // For DNSO -- String sorting based on alphabetically.
		ts.add("Sonu");
		ts.add("Rinku");
		ts.add("Abhishek");
		ts.add("A");   // unicode value of A is 65 
		ts.add("a");	// unicode value of a is 97 
	    ts.add("Rakesh");
	    ts.add("Tannu");
	    ts.add("Shiv");
	    ts.add("Mayank");
	    ts.add("Puneet");
	//    ts.add(30);  // RE --java.lang.ClassCastException: 
	    System.out.println("TreeSet for String Object: "+ts); 
	    
	    TreeSet<Integer> tset = new TreeSet<Integer>(); // For DNSO -- Integer sorting based on Ascending Order.
	    tset.add(10);
	    tset.add(61);
	    tset.add(77);
	    tset.add(47);
	    tset.add(81);
	    tset.add(39);
	    System.out.println("TreeSet for Integer Object: "+tset); 
	}
}
