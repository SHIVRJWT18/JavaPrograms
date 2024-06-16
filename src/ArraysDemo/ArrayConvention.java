package ArraysDemo;

import org.testng.annotations.Test;

public class ArrayConvention 
{

	@Test
	public void GetArrayDetails()
	{
		int[] ar = new int[2];    //1d
		char[][] ch = new char[1][2];  //2d
		String[][][] str = new String[2][1][2];  //3d
		
		System.out.println(ar.getClass().getName());
		System.out.println(ch.getClass().getName());
		System.out.println(str.getClass().getName());
	}
	
	@Test
	public void GetArrayIndexedValue()
	{
		int[] a = new int[3];
		System.out.println(a);   //hashcode
		char[][] ch = new char[1][2];  
		System.out.println(ch);  //hashcode
		
		System.out.println(a[0]);
		System.out.println(ch[0][1]);
		
	}
	
}
