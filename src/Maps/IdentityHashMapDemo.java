package Maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

import org.testng.annotations.Test;

public class IdentityHashMapDemo {

	// In Normal Hash Map JVM will use. equals() to identify duplicate keys, which is meant for content comparison.
	@SuppressWarnings("removal")
	@Test
	public void GetHashMapDemo()
	{
	 HashMap<Integer, String> hm = new HashMap<Integer, String>();
	 
	 Integer i1 = new Integer(100);
	 Integer i2 = new Integer(100);
	 
	 hm.put(i1, "Pawan");     // Here i1 and i2 are dublicate keys becoz JVM uses i1.equals(i2)
	 hm.put(i2,"Kalayan");   //  return -- true (Content Comparsion) thus replace its value 
	 
	 System.out.println("HashMap Objects; "+hm);
	}
	
	@Test
	public void GetIdentityHashMapDemo()
	{
	 IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
	 
	 Integer i1 = new Integer(500);
	 Integer i2 = new Integer(500);
	 
	 ihm.put(i1, "Pawan");     // Here i1 and i2 are not dublicate keys becoz JVM uses i1==i2
	 ihm.put(i2,"Kalayan");   //  return -- false (Reference Comparsion) thus not replace its value 
	 
	 System.out.println("IdentityHashMap Objects; "+ihm);
	}
}
