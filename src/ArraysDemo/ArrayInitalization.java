package ArraysDemo;

import org.testng.annotations.Test;

public class ArrayInitalization {

	@Test
	public void SetArrayValues()
	{
	 int ar[] = new int[3];
	 ar[0] = 10;
	 ar[1] =20;
	 ar[2] =30;
	 
	 System.out.println("Total Size: "+ar.length);
	 
	 System.out.println(ar);
	 
	 System.out.println(ar[0]+" "+ar[1]+" "+ar[2] );
	}
	
	@Test
	public void SetArrayValuesAtSingleLine()
	{
		String[] str = {"Abhishek","Puneet","Rakesh","Tannu","Sonu"};
		
		System.out.println("Total length: "+str.length);   
		
		System.out.println("Total Character: "+str[1].length());
		
		System.out.println(str[2]);
		
		System.out.println(str[1]);
	}
}
