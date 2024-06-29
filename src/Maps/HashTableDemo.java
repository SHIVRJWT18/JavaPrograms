package Maps;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class HashTableDemo {

	@Test
	public void GetHashTableDemo()
	{
	 Hashtable ht = new Hashtable(25);
	 ht.put(new Demo(5),"A");
	 ht.put(new Demo(2),"B");
	 ht.put(new Demo(6),"C");	
	 ht.put(new Demo(15),"D");	
	 ht.put(new Demo(23),"E");
	 ht.put(new Demo(16),"F");
   //  ht.put(new Demo(14),null);  // R.E: java.lang.NullPointerException  Null not allowed for key & not for value  

     System.out.println("Hashtable Objects: "+ht);
	
	}
}


class Demo
{
 int x;
 Demo(int i)
 {
  this.x=i;	 
 }
 public int hashcode()
 {
	 return x;
 }
 public String toString()
 {
	 return x+"";
 }
 
}