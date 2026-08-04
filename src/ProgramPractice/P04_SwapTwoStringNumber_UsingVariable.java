package ProgramPractice;

public class P04_SwapTwoStringNumber_UsingVariable {

	String s1 = "Hey";
	String s2 = "Rahul";    
	int no1 = 67;
	int no2 = 89;
	
	public void swapString() {
	System.out.println("before Swaping: "+s1+".."+s2);
	String temp="";
	temp = s2;
	s2 = s1;
	s1 = temp;
	 System.out.println("before Swaping: "+s1+".."+s2);
	}
	
	public void swapNumber() {
	System.out.println("before Swaping: "+no1+".."+no2);	
	int temp;
	temp = no2;
	no2 = no1;
	no1 = temp;
	System.out.println("before Swaping: "+no1+".."+no2);
	}
	public static void main(String[] args) {
	P04_SwapTwoStringNumber_UsingVariable snv = new P04_SwapTwoStringNumber_UsingVariable();
	snv.swapString();
	snv.swapNumber();
	}

}
