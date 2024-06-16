package CollectionFrmwrk.Cursors;

import java.util.Vector;
import org.testng.annotations.Test;

public class EnumerationDemo 
{

	@Test
	public void EnumerationDemoforVector()
	{
	 Vector v = new Vector();
	 for(int i=0;i<15;i++)
	 {
	  v.add(i);	 
	 }
	 System.out.println(v.capacity());
	 System.out.println(v);
	 
	}
}
