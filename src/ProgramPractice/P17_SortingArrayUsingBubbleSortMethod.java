package ProgramPractice;

import java.util.Arrays;
import java.util.Collections;

public class P17_SortingArrayUsingBubbleSortMethod {

	int[] arr = {5,9,7,1,4,2,6,3};
	
	/* Case1: Sorting 
	 * Ascending -> Default Sorting of Arrays
	 * Descending -> Swaping of default sorted array  
	*/
	public void arraySort(int[] ary)
	{
	 System.out.println("Before Sorting: "+Arrays.toString(ary));		
	 Arrays.sort(ary);
	 System.out.println("Ascending  Sorting: "+Arrays.toString(ary));		
	
	 // Swap the sorted array
    for(int i = 0; i < ary.length / 2; i++)
    {
        int temp = ary[i];
        ary[i] = ary[ary.length - 1 - i]; // swap 1st and last element
        ary[ary.length - 1 - i] = temp;
    }
     System.out.println("Descending Sorting: " + Arrays.toString(ary));
	}
	
	/* Case2:  
	 * Sorting -> Bubble Sort of given array 
	*/
	public void bubbleSort(int[] a)
	{
	 int temp=0;	
	 System.out.println("Before the Sorting: "+Arrays.toString(a));		

	 for(int i=0;i<a.length-1;i++)
	 {
	  for(int j=0;j<a.length-1;j++)
	  {
		if(a[j]>a[j+1]) // Change the sign to reverse the sorting
		{
		 temp = a[j];
		 a[j] = a[j+1];
		 a[j+1] = temp;
 		 
		}		
	  }
	 }	
	 System.out.println("After the Sorting: "+Arrays.toString(a));		
	}
	
	public static void main(String[] args) {
		P17_SortingArrayUsingBubbleSortMethod sam = new P17_SortingArrayUsingBubbleSortMethod();
		sam.arraySort(sam.arr);
		sam.bubbleSort(new int[]{9,8,6,3});
	}

}
