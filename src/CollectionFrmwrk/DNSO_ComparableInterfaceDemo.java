package CollectionFrmwrk;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class DNSO_ComparableInterfaceDemo {

	@Test
	public void GetComparableInterfaceDemo1()
	{
		System.out.println("A".compareTo("R"));  // Return Negative as A comes before R
		
		System.out.println("K".compareTo("C"));  // Return Positive as K comes after C
		
		System.out.println("P".compareTo("P"));  // Return 0 as P is equal
		
	//	System.out.println("F".compareTo(null));  // RE: Null pointer Exception
	}
	
	/* Obj1.compareTo(Obj2)
	 *   Obj1 -- trying to insert and Obj2 --- already inserted
	 */
	
	@Test
	public void GetComparableInterfaceDemo2()
	{
		TreeSet<String> t = new TreeSet<String>();
		t.add("N");     // First no comparision happen
		t.add("E");     // Internally E.compareTo(N)   ---> Neg. No (First time)		
		t.add("F");     // F.compareTo(N)  ---> Neg.No  &  F.compareTo(E)  ---> Neg.No // As E is inserted already with Neg.
		t.add("Q");     // Q.compareTo(N)  ---> Pos.No (First time)	
		t.add("Y");     // Y.compareTo(N)  ---> Pos.No   & Y.compareTo(Q)  ---> Pos.No // As Q is inserted already with Pos.
		
		System.out.println("TreeSet Objects: "+t);
		
		
		
		
		
		
	}
}
