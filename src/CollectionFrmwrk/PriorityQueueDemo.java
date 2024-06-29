package CollectionFrmwrk;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class PriorityQueueDemo {

	@Test
	public void GetPQueueElements()
	{
		PriorityQueue pq = new PriorityQueue();
		System.out.println(pq.peek());  // null
		// System.out.println(pq.element()); // RE: java.util.NoSuchElementException
		for(int i=101;i<115;i++)
		{
			pq.offer(i);
		}	
		System.out.println("PriorityQueue Objects: "+pq);
		System.out.println(pq.poll()); // remove head element and return it
		System.out.println("New PriorityQueue Objects: "+pq);
	}
}
