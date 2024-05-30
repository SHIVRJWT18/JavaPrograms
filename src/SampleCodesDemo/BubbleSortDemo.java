package SampleCodesDemo;

import java.util.Arrays;

public class BubbleSortDemo {

	static int[] DoBubbleSort(int array[])
	{
		int size = array.length;
		
		for(int i=0;i<size-1;i++)
		for(int j=0;j<size-i-1;j++)	//No use of brace
        if(array[j]>array[j+1]) 
        {
         int temp = array[j];
         
         array[j] = array[j+1];
         array[j+1] = temp;
         
         System.out.println("phases: "+array[j]+"..."+array[j+1]+">>"+temp);

        }
		return array;	
	
	}

	
	public static void main(String[] args) {

     int[] data = {7,1,4,3,9};
     System.out.println("Before Sort: "+Arrays.toString(data));
     data = DoBubbleSort(data);
     System.out.println("After Sort: "+Arrays.toString(data));
     

	}

}
