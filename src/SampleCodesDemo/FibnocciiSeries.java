package SampleCodesDemo;

public class FibnocciiSeries {
	
	// Fibnocci Series = Third no is sum of previous two 2,3,5,8...
	
    static int x =0;
	static int y =1;
	static int z =0;
	
	public static void GetFibnocciiSeries(int count)
	{

	if(count>0)
	{
     z = y+x;	
	x =y;
	 
	 y=z;
	 
	
	 
	 System.out.print(".."+z);
	 
	 GetFibnocciiSeries(count-1); // calling same method 
	}	
	}
	
	

	public static void main(String[] args) {
		
		int count =11;
		System.out.print(x+".."+y);
		FibnocciiSeries.GetFibnocciiSeries(count-2);

	}

}
