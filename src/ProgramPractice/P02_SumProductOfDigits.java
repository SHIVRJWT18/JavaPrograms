package JavaPrograms;

public class P02_SumProductOfDigits {
	
	public int digitSum(int num)
	{
	 int sum =0;
	 while(num!=0)
	 {
	  sum = sum+(num%10);
	  num = num/10;
	 }	 
	 return sum;
	}
	
	public int digitProduct(int num)
	{
	 int prod =1;
	 while(num!=0)
	 {
	  prod = prod* (num%10);
	  num = num/10;
	 }	 
	 return prod;
	}

	public static void main(String[] args) {
		P02_SumProductOfDigits sd = new P02_SumProductOfDigits();
		int getSum = sd.digitSum(829);
		int getPrd = sd.digitProduct(45);
		System.out.println("Sum of your digit: "+getSum);
		System.out.println("Product of your digit: "+getPrd);

	}

}
