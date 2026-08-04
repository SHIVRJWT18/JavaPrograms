package ProgramPractice;

public class P13_PrimeEvenOddNumber {

	public void printNumbers(int limit)
	{
	    String prime = "";
	    String even = "";
	    String odd = "";

	    for(int i = 1; i <= limit; i++)
	    {
	        // Check prime
	        int count = 0;
	        for(int j = 1; j <= i; j++)
	        {
	            if(i % j == 0)
	            {
	                count++;
	            }
	        }

	        if(count == 2)
	        {
	            prime = prime + i + ", ";
	        }

	        // Check even
	        if(i % 2 == 0)
	        {
	            even = even + i + ", ";
	        }

	        // Check odd
	        if(i % 2 != 0)
	        {
	            odd = odd + i + ", ";
	        }
	    }

	    System.out.println("Prime: " + prime);
	    System.out.println("Even: " + even);
	    System.out.println("Odd: " + odd);
	}
	
	public void checkNumber(int num)
	{
	    // Check Even/Odd
	    if(num % 2 == 0)
	    {
	        System.out.println("Even: " + num);
	    }
	    else
	    {
	        System.out.println("Odd: " + num);
	    }

	    // Check Prime
	    int count = 0;

	    for(int i = 1; i <= num; i++)
	    {
	        if(num % i == 0)
	        {
	            count++;
	        }
	    }

	    if(count == 2)
	    {
	        System.out.println("Prime: " + num);
	    }
	    else
	    {
	        System.out.println("Not Prime: " + num);
	    }
	}
	public static void main(String[] args) {
		P13_PrimeEvenOddNumber peo = new P13_PrimeEvenOddNumber();
		peo.printNumbers(10);
		peo.checkNumber(9); // Check prime even Or odd -> odd&notprime
		peo.checkNumber(4); // Check prime even Or odd -> even&notprime
		peo.checkNumber(7); // Check prime even Or odd -> odd&prime
		peo.checkNumber(2); // Check prime even Or odd -> even&prime

	}

}
