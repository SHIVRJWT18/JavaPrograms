package SampleCodesDemo;

public class DesignPattern {
	int i;
     public void printLeftPattern(int n)
     {
    	 for(i=1;i<n;i++)
    	 {
    		 for(int j=1;j<=i;j++)
    		 {	 
    		  System.out.print("*");
    		
    		 }
    		 System.out.println();  
    	 }	
    	 
     }
     
     public void printPyramidPattern(int n)
     {
    	 for(i=1;i<n;i++)
    	 {
    		 for(int j=n-1;j>1;j--)
    		 {	 
    		  System.out.print(" ");
    		
    		 }
    		 for(int j=1;j<=i;j++)
    		 {	 
    		  System.out.print("*");
    		
    		 }
    		 System.out.println();  
    	 }	
    	 
     }
	
	public static void main(String[] args) {
		DesignPattern dp = new DesignPattern();
		//dp.printLeftPattern(6);
		
		dp.printPyramidPattern(6);

	}

}
