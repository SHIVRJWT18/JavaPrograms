package SampleCodesDemo;


public class RemoveDublicateElementInArray {

	public static int FilterDublicateElement(int[] x,int n)
	{
		if(n==0 || n==1)
		{
			return n;			
		}
		
		int temp =0;
		for(int i=0;i<n-1;i++)
		{
		 if(x[i]!=x[i+1])
		 {
		  x[temp++] =x[i];	 
		 }	 
		}	
		x[temp++] = x[n-1];  
	    return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,30,30,30,80,95,95,70};
		
		int size = arr.length;
		
		System.out.println(size);
		size = FilterDublicateElement(arr, size);
		for (int i=0; i<size; i++)  
	           System.out.print(arr[i]+" ");  
	    }  
	}
	
	
