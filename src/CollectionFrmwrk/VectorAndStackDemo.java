package CollectionFrmwrk;

import java.util.Stack;
import java.util.Vector;

import org.testng.annotations.Test;

public class VectorAndStackDemo {

    @Test
    public void VectorDemo()
    {
    	Vector v = new Vector();
    	System.out.println("Default Capacity V: "+v.capacity()); // Vector Capacity = 10
    	for(int i=0;i<10;i++)
    	{
    	  v.add("A10"+i);
    	}	
    	System.out.println(v);
    	v.add("B100");
    	System.out.println(v);
    	System.out.println("Incremented Capacity V: "+v.capacity()); // New Capacity = 10+10
    }
    
    @Test
    public void VectorCapacityDemo()
    {
    	Vector v1 = new Vector(10,2);
    	System.out.println("Default Capacity V1: "+v1.capacity()); // Vector Capacity = 10
    	for(int i=0;i<20;i++)
    	{
    		v1.add("C10"+i);
    	}	
    	System.out.println(v1);
    	for(int i=0;i<10;i++)
    	{
    		v1.add("D10"+i);
    	}
    	System.out.println(v1);
    	System.out.println("Incremented Capacity V1: "+v1.capacity()); // New Capacity = 10*2+10

    }
    
    @Test
    public void StackDemo()
    {
    	Stack s = new Stack();
    	s.push("Sonu");
    	s.push("Tannu");
    	s.push("Rakesh");
    	s.push("Puneet");
    	
    	//Last In First Out
    	
    	System.out.println(s.empty());
        System.out.println("Stack Element: "+s.search("Rakesh")); //2
        System.out.println("Stack Element: "+s.search("Puneet")); //1
        System.out.println("Stack Element: "+s.search("Abhishek")); //-1  Not found
        System.out.println("Stack Element: "+s.search("Sonu")); //4

    }
}
