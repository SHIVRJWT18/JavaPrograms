package SampleCodesDemo;

public class SwapTwoNosWithoutUseThirdVariable {

	public void swapMethod1(int x,int y)
	{
	 if(x==0)
	 {
	  y=x;
	  y=0;
	  System.out.println("Swapped: "+x+"...."+y);
	 }
	 else if(y==0)
	 {
	  x=y;
	  y=0;
	  System.out.println("Swapped: "+x+"...."+y);
	 }
	 else
	 {
	  x=x+y;
	  y=x-y;
	  x=x-y;	  
	  System.out.println("Swapped: "+x+"...."+y);
	 }		
	}
	
	 public void swapMethod2(int x,int y)
	 {
		 if(x==0)
		 {
		  y=x;
		  y=0;
		  System.out.println("Swapped: "+x+"...."+y);
		 }
		 else if(y==0)
		 {
		  x=y;
		  y=0;
		  System.out.println("Swapped: "+x+"...."+y);
		 }
		 else
		 {
		  x=x*y;
		  y=x/y;
		  x=x/y;	  
		  System.out.println("Swapped: "+x+"...."+y);
		 }	 
		
	}
	
	public static void main(String[] args) 
	{
		SwapTwoNosWithoutUseThirdVariable s = new SwapTwoNosWithoutUseThirdVariable();
        s.swapMethod1(70, 40);
        
        s.swapMethod2(70, 40);
	}

}
