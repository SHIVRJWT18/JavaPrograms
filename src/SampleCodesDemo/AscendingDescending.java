package SampleCodesDemo;

import java.util.Arrays;

public class AscendingDescending {
	public void GetDecending(int[] a)
    {
      int temp = 0;
      System.out.println("Original Array: "+Arrays.toString(a));
      for(int i=0;i<a.length;i++)
      {
        for( int j= i+1;j<a.length;j++)
        {
        if(a[i]<a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
        }
      }
      System.out.println("Sorted Array1: "+Arrays.toString(a));

    }
    
    public void GetAscending(int[] a)
    {
      int temp = 0;
      System.out.println("Original Array: "+Arrays.toString(a));
      for(int i=0;i<a.length;i++)
      {
        for( int j= i+1;j<a.length;j++)
        {
        if(a[i]>a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
        }
      }
      System.out.println("Sorted Array2: "+Arrays.toString(a));

    }
    
    public static void main(String[] args) {
    	AscendingDescending ad = new AscendingDescending();
    	int[] arr1 = {11,99,14,69,78,36};
    	int[] arr2 = {60,78,10,99,47,39,15};
    	
    	ad.GetDecending(arr1);
    	System.out.println();
    	ad.GetAscending(arr2);
	}
}
