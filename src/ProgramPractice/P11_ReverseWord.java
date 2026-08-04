package ProgramPractice;

public class P11_ReverseWord {

	public void reverseWord(String word)
	{
	 String output = "";	
	 String[] processedword = word.split(" ");	
	 System.out.println("Given Word: "+word);
	 for(int i=processedword.length-1;i>=0;i--)
	 {
	  output = output+processedword[i]+" ";	 
	 }	 
	  System.out.println("Output: "+output);	 
	}
	public static void main(String[] args) {
		P11_ReverseWord rw = new P11_ReverseWord();
		rw.reverseWord("My name is khan");
	}

}
