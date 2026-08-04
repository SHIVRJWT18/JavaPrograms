package ProgramPractice;

public class P08_ReverseString {

	public void reverseSingleWord(String stg)
	{
	 System.out.println("Given Word: "+stg);
	 String rev = "";
	 for(int i=stg.length()-1;i>=0;i--)
	 {
	  rev = rev+stg.charAt(i);
	 }	
	 System.out.println("Processed Word: "+rev);	
	}
	
	public void reverseDoubleWord(String stg)
	{
	 System.out.println("Given Word: "+stg);
	 String rev = "";
	 String[] words = stg.split(" ");
	 for(String given : words)
	 {	 	
	 for(int i=given.length()-1;i>=0;i--)
	 {
	  rev = rev+given.charAt(i);
	 }	
	 rev =rev+" ";
	}
	 System.out.println("Processed Word: "+rev);	

	}	 
	
	public static void main(String[] args) {
		P08_ReverseString revs = new P08_ReverseString();
		revs.reverseSingleWord("Rakesh");
		revs.reverseDoubleWord("Rakesh Bhadoria");
	}

}
