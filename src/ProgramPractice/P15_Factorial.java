package ProgramPractice;

public class P15_Factorial {

	public void printFacotrial(int num)
	{
	int temp=1;	
	for(int i=num;i>=1;i--)
	{
	 temp = temp*i;
	}
	 System.out.print("Factorial of "+num+ " is: "+ temp+" ");

	}
		public static void main(String[] args) {
			P15_Factorial fac = new P15_Factorial();
			fac.printFacotrial(4);
	}

}
