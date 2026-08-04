package JavaPrograms;

public class P01_VowelPresence {
	
	public void isVowelPresent(String str)
	{
	 str = str.toLowerCase();	
     int count =0;
     for(int i=0;i<str.length();i++)
     {
      if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
      {
       System.out.println("Vowel Present "+str.charAt(i));
       count++;
      }
     }
     
      if(count==0)
      {
       System.out.println("No Vowel found");
      }
      else
      {
       System.out.println("Vowel count: "+count);
      } 	        
	}
	
	// Macthing Pattern based
	public void checkVowel(String str)
	{
	 str = str.toLowerCase();	
     if(str.matches(".*[aeiou].*"))
     {
      System.out.println("Vowel is present in "+str);
     }
     else
     {
         System.out.println("Vowel is not present in "+str);
	 }
     }

	public static void main(String[] args) {
	P01_VowelPresence vp = new P01_VowelPresence();
	vp.isVowelPresent("Automation");
	vp.checkVowel("apple");	
	vp.checkVowel("Sky");	
	}
	

}
