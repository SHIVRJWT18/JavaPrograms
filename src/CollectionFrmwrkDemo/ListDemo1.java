package CollectionFrmwrkDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo1 {


	public static void main(String[] args) 
	{
		ArrayList<Object> d1 = new ArrayList<Object>();
		
		d1.add("Shiv");
		d1.add(230);
		d1.add(3.699);
		d1.add('j');
		System.out.println(d1);
		d1.remove(1);
		System.out.println(d1);
		
		
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.addFirst("Keshav");
		ll.add(1, "Arati");
		ll.addLast(05);
		ll.addFirst(60);
        ll.add(4, null);
		System.out.println(ll.getLast());
		
		System.out.println(ll.get(3));
		
		System.out.println(ll.get(1));
		
		ll.set(3, "Viren");
		
		ll.remove(1);
		
		System.out.println(ll);
		
		
		Vector v = new Vector(4);
		
		v.add("abc");
		v.add(1,"def");
		v.add(2, "efg");
		v.add(30);
		v.add(3,null);
		
		System.out.println(v);
		
		Stack<String> s = new Stack<String>();
        s.push("First");
        s.push("Second");
        s.push("Third");
        
        System.out.println(s);
        
        System.out.println(s.empty());
        
        System.out.println(s.search("Thi"));  // Not Available
        
        System.out.println(s.search("Third")); // Available
		

	}	

}

 
