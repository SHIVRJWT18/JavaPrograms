package CollectionFrmwrk.Cursors;

import java.util.Enumeration;
import java.util.Vector;
import org.testng.annotations.Test;

public class EnumerationDemo 
{
    // Useful for Legacy Classes(comming from old versions) such as Vector and Stack
	@Test
	public void EnumerationDemoforVector()
	{
	 Vector v = new Vector();
	 for(int i=0;i<=30;i++)
	 {
	  v.add(i);	 
	 }
	 System.out.println(v.capacity());
	 System.out.println(v);
	 
	 Enumeration enu = v.elements();
	 while(enu.hasMoreElements())
	 {
		 Integer inte = (Integer) enu.nextElement();
		 if(inte%3==0 && inte%4==0)
		 {
		  System.out.println("Elements are: "+inte);	 
		 }	 
	 }	 
	 System.out.println(v);
	 
	 
	}
}
