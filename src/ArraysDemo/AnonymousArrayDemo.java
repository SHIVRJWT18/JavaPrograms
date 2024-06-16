package ArraysDemo;

import org.testng.annotations.Test;

public class AnonymousArrayDemo {

	public void getSum(int[] x)
	{
	 int total = 0;	
	 for(int i=0;i<x.length;i++)
	 {
	  total = total+x[i];	 
	 }	
	 
	 System.out.println("Total Value: "+total);
	}
	
	public void getNames(String[] s)
	{
	 System.out.println("Total length:" +s.length);	 // Array length/size
     for(String st :s)
     {
    	System.out.println(st+"...."+st.length()); // length of characters in string
     }	 
	}
	
	@Test
	public void GetSumOfArrayIndexedElement()
	{
		AnonymousArrayDemo ad = new AnonymousArrayDemo();
		ad.getSum(new int[] {50,60,70});
		ad.getSum(new int[] {1050,2060,3070});
		ad.getNames(new String[] {"Abhishek","Puneet","Rakesh","Tannu","Sonu"});
	}
	

}
