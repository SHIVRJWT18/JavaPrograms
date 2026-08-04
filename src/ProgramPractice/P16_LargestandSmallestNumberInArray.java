package ProgramPractice;

public class P16_LargestandSmallestNumberInArray {

	int[] ar1 = {3,0,18,2,100}; // Postive array
	int[] ar2 = {3,-5,18,2,-1}; // Negative array

	public void getLargestSmallest(int[] a)
	{
	 int larg = a[0];	
	 int smal = a[0];
	 for(int i=0;i<a.length;i++)
	 {
	   if(a[i]>larg)
	   {
		larg = a[i];   
	   }
	   if(a[i]<smal)
	   {
		 smal = a[i];  
	   }	   
	 }
	  System.out.println("Largest Number: " + larg);
	  System.out.println("Smallest Number: " + smal);	  	 
	}
		
	public void getSecondLargeSecondSmall(int[] a)
	{
	 int Large = a[0];
	 int Small = a[0];
	 int sLarge = a[0];
	 int sSmall = a[0];
	 
	 for(int i=0;i<a.length;i++)
	 {
	  if(a[i]> Large)
	  {
		Large = a[i];  
	  }
	  else if(a[i] > sLarge && a[i] != Large)
      {
		  sLarge = a[i];
      }
	  
	  if(a[i]< Small)
	  {
		Small = a[i];  
	  }
	  else if(a[i] < sSmall && a[i] != Small)
      {
		  sSmall = a[i];
      }		 
	 }
	  System.out.println("Second Largest Number: " + sLarge);
	  System.out.println("Second Smallest Number: " + sSmall);
	}

	
	public static void main(String[] args)
	{
	 P16_LargestandSmallestNumberInArray lsn = new P16_LargestandSmallestNumberInArray();	
	 lsn.getLargestSmallest(lsn.ar1); // First array
	 System.out.println("=========================");
	 lsn.getSecondLargeSecondSmall(lsn.ar1);
	 System.out.println("=========================");
	 
	 lsn.getLargestSmallest(lsn.ar2); // Second array
	 System.out.println("=========================");
	 lsn.getSecondLargeSecondSmall(lsn.ar2);

	}
	
}
