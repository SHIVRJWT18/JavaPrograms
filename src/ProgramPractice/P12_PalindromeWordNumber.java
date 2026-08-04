package ProgramPractice;

public class P12_PalindromeWordNumber {
	StringBuilder temp = new StringBuilder();
	public void checkPalindromeString(String str)
	{
	// String temp= "";        // Without Using String builder
	 str = str.replace(" ", "");
	 for(int i=str.length()-1;i>=0;i--)
	 {
	 // temp = temp+str.charAt(i);   // Without Using String builder to avoid repeated concatenation
	 temp= temp.append(str.charAt(i));

	 }	 
	 System.out.println("Output :"+temp);
	// if(temp.equalsIgnoreCase(str))    // Without Using String builder
	 if(temp.toString().equalsIgnoreCase(str))
	 {
	  System.out.println("String is palindrome: "+str);	 
	 }	 
	 else
	 {
	  System.out.println("String is not palindrome");	 
	 }	 
		
	}
	
	public void checkPalindromeNumber(int num)
	{
	 int mynum = num; // Store original number || Later value of num is modified inside while loop
	 int revno = 0;
	 while(num!=0)
	 {
	  revno = revno*10+ (num % 10);
	  num = num/10;
	 }	 
	  System.out.println("Output: "+revno);
	  if(revno==mynum)
	  {
	   System.out.println("Number is palindrome: "+mynum);	  
	  }
	  else
	  {
		  System.out.println("Number is not palindrome");	  
	  }	  
	
	}
	
	public static void main(String[] args) {
		
		P12_PalindromeWordNumber pw = new P12_PalindromeWordNumber();
		pw.checkPalindromeString("Top Spot");
		pw.checkPalindromeNumber(525);
	}

}
