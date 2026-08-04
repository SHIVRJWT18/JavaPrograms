package ProgramPractice;

public class P09_ReverseNumber {
	
	public void reverseNumber(int num)
	{
	 System.out.println("Given Number: "+num);
	 int rev =0;	
	 while(num!=0)
	 {
	  rev = rev*10+(num%10) ;  // Main Logic
	  num = num/10;
	 }	 
	 System.out.println("Processed Number: "+rev);
	}

	public static void main(String[] args) {
		P09_ReverseNumber revn = new P09_ReverseNumber();
		revn.reverseNumber(123456);

	}

}
