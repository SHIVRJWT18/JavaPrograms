package SampleCodesDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {20,10,56,78,97,45,14};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)
		{
			al.add(arr[i]);
		}
		
		System.out.println("Extracted Array: "+al);

	}

}
