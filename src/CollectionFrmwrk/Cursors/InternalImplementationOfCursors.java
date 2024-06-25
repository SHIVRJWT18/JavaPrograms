package CollectionFrmwrk.Cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

import org.testng.annotations.Test;

public class InternalImplementationOfCursors {

	@Test
	public void GetImplementationClassNameForCursors()
	{
		Vector v = new Vector();
		Enumeration enu = v.elements(); // Enumration only applicable for Vector and Stack as legacy classes
		System.out.println(enu.getClass().getName()); //Annonymous Inner class inside Vector Class
		
		ArrayList al = new ArrayList();
		Iterator it = al.iterator(); //Iterator is a universal cursor and applicable for any collection Object
		System.out.println(it.getClass().getName());
		
		LinkedList ll = new LinkedList();
		ListIterator li = ll.listIterator(); // ListIterator only applicable for LinkList implemented classes
		System.out.println(li.getClass().getName());
	}
}
