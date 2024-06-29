package CollectionFrmwrk;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class CSO_PriorityQueueDemo {

	@Test
	public void GetNameInitialsPriority()
	{
		PriorityQueue q = new PriorityQueue(15,new Customcomp());
		q.offer("A K");
		q.offer("P S");
		q.offer("B K");
		q.offer("C B");
		q.offer("J K");
		q.offer("J K");
		
		System.out.println("CSO PQueue Objects: "+q);
	}
}
class Customcomp implements Comparator
{
 public int compare(Object o1,Object o2)
 {
	 String s1 = o1.toString();
	 String s2 = o2.toString();
	 return s2.compareTo(s1);
 }
}