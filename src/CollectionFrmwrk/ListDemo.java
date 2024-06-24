package CollectionFrmwrk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

import org.testng.annotations.Test;

public class ListDemo 
{
    @Test
	public void ArrayListDemo()
	{
    	ArrayList al = new ArrayList();
    	al.add("Puneet");
    	al.add("Rakesh");
    	al.add("Sonu");
    	al.add("Abhishek");
    	al.add("Tannu");
    	al.add("Puneet");
    	al.add(10);
    	al.add(null);
    	System.out.println("Before Removal: "+al);
    	
    	al.add(3,"Shiv");
    	al.add(2,"Puneet");
    	System.out.println("Total List: "+al.size());
    	
    	al.remove(5);
    	System.out.println("After Removal: "+al);
    	
	}
    
    @Test
    public void LinkedListDemo()
    {
    	LinkedList<String> ll = new LinkedList<String>();
        ll.add(0,"Tue");
        ll.add(1,"Thur");
        ll.addFirst("Mon");
        ll.addLast("Sun");
        ll.add(3,"Fri");
        ll.add(2,"Wed");
        ll.add(5, "Sat");
        
        System.out.println("Total List: "+ll.size());
        
        System.out.println("Before Removal: "+ll);
    }
    
    
    @Test
    public void CheckImplementation()
    {
    	ArrayList alist = new ArrayList();
    	LinkedList llist = new LinkedList();
    	
    	System.out.println(alist instanceof Serializable); //t
    	System.out.println(llist instanceof Cloneable); //t
    	System.out.println(alist instanceof RandomAccess); //t
    	System.out.println(llist instanceof RandomAccess); //f
    }

}
