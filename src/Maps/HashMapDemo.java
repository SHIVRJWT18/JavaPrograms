package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapDemo {

	@Test
	public void GetHashMapDemo()
	{
	 HashMap hm = new HashMap();
	 hm.put("Tannu", 1);
	 hm.put("Sonu",2);
	 hm.put("Rakesh", 3);
	 hm.put("Abhishek", 4);
	 hm.put("Puneet", 5);
	 hm.put("Puneet", 6);
	 System.out.println("HashMap Objects: "+hm);    // // Insertion order not preserved and based on HashTable
	 
	 System.out.println("Replaced Id: "+hm.put("Tannu", 7)); // return old associated value and set new value 
	 System.out.println("Replaced Id: "+hm.put("Puneet", 8)); // return old associated value and set new value
	 
	 Set st = hm.keySet();
	 System.out.println("HashMap Keys: "+st); // Set return keys as these are not have dublicate 
	 
	 Set st1 = hm.entrySet();
	 System.out.println("HashMap.Entry Objects: "+st1); // return entries 
	 
	 Collection col = hm.values();
	 System.out.println("HashMap Values: "+col); // Collection return values as these may have dublicate 
	 
	 Iterator ite = st1.iterator();
	 System.out.println("Get HashMapObjects One by one: ");
	 while(ite.hasNext())
	 {
	  Map.Entry m1 = (Map.Entry)ite.next();
	  System.out.println(m1.getKey()+"---"+m1.getValue());
	  if(m1.getKey().equals("Tannu"))
	  {
		m1.setValue(9);  
	  }	  
	 }
	 
	 System.out.println("Final HashMapObjects: "+hm);
	}
	
	
	
	@Test
	public void GetLinkedHashMapDemo()
	{
		 LinkedHashMap lhm = new LinkedHashMap();
		 lhm.put("Tannu", 1);
		 lhm.put("Sonu",2);
		 lhm.put("Rakesh", 3);
		 lhm.put("Abhishek", 4);
		 lhm.put("Puneet", 5);
		 lhm.put("Puneet", 6);
		 System.out.println("LinkedHashMap Objects: "+lhm);    // Insertion order is preserved and based on HashTable+LinkedList	
	}
}
