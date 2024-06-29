package Maps;

import java.util.Comparator;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class SortedMap_TreeMapDemo {

	@Test
	public void TreeMapDemostrationforIntegerObjectCSO()
	{
	 TreeMap tm = new TreeMap(new CustomCompInteger());
	 tm.put(105, "Vikas");
	 tm.put(101,"Abhay");
	 tm.put(109,"Zakir");
	 tm.put(106,"Aditya");
	 tm.put(104,null);  
 	 tm.put(108,"Yuvraj");
	 
	 System.out.println("Tree Map Integer Objects: "+tm);
	}
	
	@Test
	public void TreeMapDemostrationforStringObjectCSO()
	{
	 TreeMap tm = new TreeMap(new CustomCompString());
	 tm.put("Vikas","V");
	 tm.put("Abhay","A");
	 tm.put("Zakir","Z");
	 tm.put("Lakshya","L");
	 tm.put("Shewta",null);  
	 
	 System.out.println("Tree Map String Objects: "+tm);
	}
}

class CustomCompInteger implements Comparator
{
 public int compare(Object o1,Object o2)
 {
	 Integer i1 = (Integer)o1;
	 Integer i2 = (Integer)(o2);
	 
	 return i2.compareTo(i1);
 }
}

class CustomCompString implements Comparator
{
 public int compare(Object o1,Object o2)
 {
	 String  s1 = o1.toString();
	 String s2 = o2.toString();
	 
	 return s2.compareTo(s1);
 }
}

