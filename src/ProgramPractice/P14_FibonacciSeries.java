package ProgramPractice;

public class P14_FibonacciSeries {
	// Fibonacci series-  Each number is the sum of the previous two numbers.
		
	public void printFibSeries(int limit)
	{
	 int fn =0;
	 int nn =1;
	 System.out.print(fn + " " + nn + " ");

	for(int i=2;i<=limit;i++)
	{
	 int temp = fn+nn;
	 System.out.print(temp+" ");
	 fn=nn;
	 nn=temp;
	}	
	}
	public static void main(String[] args) {
		P14_FibonacciSeries fs = new P14_FibonacciSeries();
		fs.printFibSeries(10);

	}

}
