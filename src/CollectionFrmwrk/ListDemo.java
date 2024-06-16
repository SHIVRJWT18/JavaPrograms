package CollectionFrmwrk;

import java.util.ArrayList;
import java.util.LinkedList;


import org.testng.annotations.Test;

public class ListDemo 
{
    @Test
	public void ArrayListDemo()
	{
    	ArrayList<String> al = new ArrayList<String>();
    	al.add("Puneet");
    	al.add("Rakesh");
    	al.add("Sonu");
    	al.add("Abhishek");
    	al.add("Tannu");
    	al.add("Puneet");
    	
    	System.out.println("Total List: "+al.size());
    	System.out.println("Before Removal: "+al);
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
    

}
