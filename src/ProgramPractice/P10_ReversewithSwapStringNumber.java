package ProgramPractice;

public class P10_ReversewithSwapStringNumber {

	public void reverseThanSwapNumber(int no1,int no2)
	{
	 System.out.println("Given Strings: "+no1+".."+no2);	

	}
	
	public void reverseThanSwapString(String a1)
	{
	 System.out.println("Given Strings: "+a1);
	 String rev = "";
	 String[] stg = a1.split(" ");
	 for(String given:stg)
	 {
	  for(int i=0;i<given.length();i++)
	  {
		rev = given.charAt(i)+rev;  
	  }
	  rev = " "+rev;
	 }	 
	 System.out.println("Processed String: "+rev);
	 
	}
	public static void main(String[] args) {
	P10_ReversewithSwapStringNumber rssn = new P10_ReversewithSwapStringNumber();
	rssn.reverseThanSwapString("Dharmendra Bhadoria");
	
	}

}
