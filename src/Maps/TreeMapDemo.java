package Maps;

import java.util.TreeMap;

import org.testng.annotations.Test;

public class TreeMapDemo {

	@Test
	public void TreeMapDemostrationforIntegerObjectDNSO()
	{
	 TreeMap tm = new TreeMap();
	 tm.put(105, "Vikas");
	 tm.put(101,"Abhay");
	 tm.put(109,"Zakir");
	 tm.put(106,"Aditya");
	 tm.put(104,null);  
	// tm.put(null,"Shewta");  // RE: java.lang.NullPointerException
 	 tm.put(108,"Yuvraj");
	// tm.put("Kisan", "Jaswant");  // RE: java.lang.ClassCastException {Insertion of Hetrogenous Key}
	 
	 System.out.println("Tree Map Integer Objects: "+tm);
	}
	
	@Test
	public void TreeMapDemostrationforStringObjectDNSO()
	{
	 TreeMap tm = new TreeMap();
	 tm.put("Vikas","V");
	 tm.put("Abhay","A");
	 tm.put("Zakir","Z");
	 tm.put("Lakshya","L");
	 tm.put("Shewta",null);  
	 
	 System.out.println("Tree Map String Objects: "+tm);
	}
}
