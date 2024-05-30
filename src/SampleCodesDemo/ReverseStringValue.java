package SampleCodesDemo;

public class ReverseStringValue {

	public String GetReversalString(String str)
	{
		String reverse = "";
		
		for(int i=0;i<str.length();i++)
		{
			reverse = str.charAt(i)+reverse;			
		}	
		
		return reverse;		
		
	}
	
	//A string is a palindrome when it stays the same on reversing the order of characters in that string.
	//It can be achieved by reversing the original string first and then checking if the reversed 
	//string is equal to the original string.
	
	public void CheckStringPalindrome(String str)
	{
		String reverse = GetReversalString(str);
		
		if(reverse.equals(str))
		{
		 System.out.println("Given String is Palindrome");	
		}	
		else
		{
		 System.out.println("String not a palindrome");	
		}
		
	}
	

	
	
	public static void main(String[] args) 
	{
		ReverseStringValue r = new ReverseStringValue();
		
		System.out.println(r.GetReversalString("Rajawat"));
		
	    r.CheckStringPalindrome("noon");
		
		

	}

}
