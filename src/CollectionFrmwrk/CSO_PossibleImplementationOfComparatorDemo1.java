package CollectionFrmwrk;

import java.util.Comparator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CSO_PossibleImplementationOfComparatorDemo1 {

	@Test
	public void GetCSOAscendingOrder_1()
	{
		TreeSet<Integer> ts1 = new TreeSet<Integer>(new customCompareDemo1());
		 ts1.add(20);
		 ts1.add(30);
		 ts1.add(20);
		 ts1.add(50);
		 ts1.add(70);
		 ts1.add(95);
		 ts1.add(44);
		 ts1.add(17);
		 
		 System.out.println("CSO_AscendingOrder1: "+ts1);		
	}
	
	@Test
	public void GetCSODecendingOrder_1()
	{
		TreeSet<Integer> ts2 = new TreeSet<Integer>(new customCompareDemo2());
		 ts2.add(20);
		 ts2.add(30);
		 ts2.add(20);
		 ts2.add(50);
		 ts2.add(70);
		 ts2.add(95);
		 ts2.add(44);
		 ts2.add(17);
		 
		 System.out.println("CSO_DescendingOrder1: "+ts2);		
	}
	
	
	@Test
	public void GetCSOAscendingOrder_2()
	{
		TreeSet<Integer> ts3 = new TreeSet<Integer>(new customCompareDemo3());
		 ts3.add(20);
		 ts3.add(40);
		 ts3.add(20);
		 ts3.add(50);
		 
		 System.out.println("CSO_AscendingOrder2: "+ts3);	
	}
	
	@Test
	public void GetCSODescendingOrder_2()
	{
		TreeSet<Integer> ts4 = new TreeSet<Integer>(new customCompareDemo4());
		 ts4.add(20);
		 ts4.add(40);
		 ts4.add(20);
		 ts4.add(50);

		 
		 System.out.println("CSO_DescendingOrder2: "+ts4);	
	}
	
	@Test
	public void GetCSOInsertionOrder_1()
	{
		TreeSet<Integer> ts5 = new TreeSet<Integer>(new customCompareDemo5());
		 ts5.add(20);
		 ts5.add(30);
		 ts5.add(20);
		 ts5.add(50);
		 ts5.add(70);
		 ts5.add(95);
		 ts5.add(44);
		 ts5.add(17);
		 
		 System.out.println("CSO_InsertionOrder1: "+ts5);		
	}
	
	@Test
	public void GetCSOReverseOfInsertionOrder_1()
	{
		TreeSet<Integer> ts6 = new TreeSet<Integer>(new customCompareDemo6());
		 ts6.add(20);
		 ts6.add(30);
		 ts6.add(20);
		 ts6.add(50);
		 ts6.add(70);
		 ts6.add(95);
		 ts6.add(44);
		 ts6.add(17);
		 
		 System.out.println("CSO_ReverseOfInsertionOrder1: "+ts6);		
	}
	
	@Test
	public void GetCSOFirstElement()
	{
		TreeSet<Integer> ts7 = new TreeSet<Integer>(new customCompareDemo7());
		 ts7.add(20);
		 ts7.add(30);
		 ts7.add(20);
		 ts7.add(50);

		 System.out.println("CSO_FirstElement: "+ts7);		
	}
}



class customCompareDemo1 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return i1.compareTo(i2);    // Customized sorting --> Ascending order // same as DNSO	  
  }
}

class customCompareDemo2 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return i2.compareTo(i1);    // Customized sorting --> Descending order // Reverse of DNSO
	  
  }
}

class customCompareDemo3 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return -i2.compareTo(i1);    // Customized sorting --> Ascending order // same as DNSO	  
  }
}

class customCompareDemo4 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return -i1.compareTo(i2);    // Customized sorting --> Descending order // same as DNSO	  
  }
}

class customCompareDemo5 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return +1;    // Customized sorting --> Insertion order 
  }
}

class customCompareDemo6 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return -1;    // Customized sorting --> Reverse of Insertion order
  }
}

class customCompareDemo7 implements Comparator<Object>
{
  public int compare(Object o1,Object o2)
  {
	Integer i1 = (Integer) o1;
	Integer i2 = (Integer) o2;
	
	return 0;    // Customized sorting --> Get First element only treat remaining as null  
  }
}
