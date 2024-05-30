package SampleCodesDemo;

public class DesignPattern {
	int i;
     public void printPattern(int n)
     {
    	 for(i=1;i<n;i++)
    	 {
    		 for(int j=1;j<=i;j++)
    		 {	 
    		  System.out.println(j);
    		
    		 }
    		 System.out.println();  
    	 }	
    	 
     }
	
	public static void main(String[] args) {
		DesignPattern dp = new DesignPattern();
		dp.printPattern(6);

	}

}
