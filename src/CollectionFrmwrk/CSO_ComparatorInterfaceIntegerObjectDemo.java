package CollectionFrmwrk;

import java.util.Comparator;
import java.util.TreeSet;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSO_ComparatorInterfaceIntegerObjectDemo {
	
	@Test
	public void GetDefaultSortingWithoutComparator()
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(50);     // First No Comparision
		t.add(66);     // Internally 66.compareTo(55)   ---> Pos No		
		t.add(33);     // 33.compareTo(50)  ---> Neg.No 
		t.add(29);     // 29.compareTo(50)  ---> Neg.No & 29.compareTo(33)  ---> Neg.No
		t.add(75);     // 75.compareTo(50)  ---> Pos.No & 75.compareTo(66)  ---> Pos No	
		
		System.out.println("DNSO TreeSet Objects: "+t);		
	}
	
	@Test
	public void GetCustomSortingWithComparator()
	{
		CustomComparator ccomp = new CustomComparator();
		TreeSet<Integer> t = new TreeSet<Integer>(ccomp);
		t.add(50);     // First No Comparision
		t.add(66);     // Internally 66.compareTo(55)   ---> Pos No		
		t.add(33);     // 33.compareTo(50)  ---> Neg.No 
		t.add(29);     // 29.compareTo(50)  ---> Neg.No & 29.compareTo(33)  ---> Neg.No
		t.add(75);     // 75.compareTo(50)  ---> Pos.No & 75.compareTo(66)  ---> Pos No	
		
		System.out.println("CSO TreeSet Objects: "+t);		
	}
}


class CustomComparator implements Comparator<Object>
{
	
	public int compare(Object o1,Object o2)
	{
	 Integer i1 = (Integer)o1;
	 Integer i2 = (Integer)o2;
	 if(i1<i2)
	 {
	  return +100;	 
	 }	 
	 else if(i1>i2)
	 {
	  return -150;
	 }
	 else
	 {
	  return 0;
	 }	 
	}
	
}

