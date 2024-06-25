package CollectionFrmwrk;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CSO_StringandStringBufferObjects {

	// WAP to get Objects in increasing order of their length Incase length is equal then use alphabetical order
	@Test
	public void CSO_IncreasingOrderOfLength()
	{
		TreeSet ts = new TreeSet(new lengthCompare());
		ts.add(new StringBuffer("A"));
		ts.add("XX");
		ts.add("ABCDE");
		ts.add(new StringBuffer("PQR"));
		ts.add("A");
		ts.add("MNOP");
		
		System.out.println("CSO TreeSet: "+ts);
		
	}
}
	
class lengthCompare implements Comparator
{
 public int compare(Object o1,Object o2)
 {
	String s1 = o1.toString();
	String s2 = o2.toString();
	int len1 = s1.length();
	int len2 = s2.length();
	if(len1<len2)
	{
		return -1;
	}	
	else if(len2<len1)
	{
		return +1;
	}
	else
	{
		return s1.compareTo(s2);
	}	
 }


}
	
	
	
	
	
	

