package SampleCodesDemo;

public class GernateRandomChar {

	//Random No generate for 5 digit if Provided input between A to Z
	
	static int max = 26;
	
	public static  String GetRandomString(int n)
	{
	  char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 
              'h', 'i', 'j', 'k', 'l', 'm', 'n',  
              'o', 'p', 'q', 'r', 's', 't', 'u', 
              'v', 'w', 'x', 'y', 'z'};
	
	  String res = "";
	  
	  
	
	for(int i=0;i<n;i++)
	
		  res = res +alphabets[(int) (Math.random()*100%max)];
	  
		  return res;
	  }

	
	
	public static void main(String[] args) {
		
     
     System.out.println("Gernated Nos: "+GetRandomString(1));
	
	
	
	
	
	
	
	}

}
