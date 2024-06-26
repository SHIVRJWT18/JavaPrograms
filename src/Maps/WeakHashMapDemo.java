package Maps;

import java.util.HashMap;
import java.util.WeakHashMap;

import org.testng.annotations.Test;

public class WeakHashMapDemo {

	@Test
	public void GetHashMapDemo() throws InterruptedException
	{
	  HashMap hm = new HashMap();
	  Temp t = new Temp();
	  hm.put(t, "Salman");
	  System.out.println("HashMap Objects: "+hm);
	  t= null;
	  System.gc();
	  Thread.sleep(5000);
	  System.out.println("After Some time: "+hm);
	}
		
	@Test
	public void GetWeakHashMapDemo() throws InterruptedException
	{
	 WeakHashMap whm = new WeakHashMap();
	 Temp t = new Temp();
	 whm.put(t, "Salman");
	 System.out.println("WeakHashMap Objects: "+whm);
	 t= null;
	 System.gc();
	 Thread.sleep(5000);
	 System.out.println("After Some time: "+whm);
	}
}

class Temp
{
 public String toString()
 {
	 return "temp";
 }
 
 public void finalize()
 {
	 System.out.println("Finally Method Called by Garbage Collector");
 }
}
