package CollectionFrmwrk.Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ListIteratorDemo {

	// Its a child class of Iteraltor(forward direction only) and a bidirectional cursor 
	// It also does add,replace,remove capabilities along with read and remove
	@Test
	public void GetListIteratorDemoForLinkedList()
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("Jan");
		l.add("Mar");
		l.add("Jun");
		l.add("Aug");
		l.add("Oct");
		System.out.println("Before List: "+l);
		
		ListIterator litr = l.listIterator();
		while(litr.hasNext())
		{
		 String st = (String)litr.next();
		 if(st.equals("Oct"))
		 {		  
		  litr.set("Nov"); //replace
		 }
		 else if(st.equals("Mar"))
		 {
		  litr.add("Feb");	
		  litr.add("Dec");
		 }
		 else if(st.equals("Jan"))
		 {
		  litr.remove();	 
		 }
		 
		}	
		System.out.println("After List: "+l);
	}
}
