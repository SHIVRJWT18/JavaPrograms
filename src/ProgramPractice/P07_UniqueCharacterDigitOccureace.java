package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class P07_UniqueCharacterDigitOccureace {
    public void uniqueDigit(int no)
    {
     // count frequency	
     HashMap<Integer,Integer> hmn = new HashMap<Integer,Integer>();
	 while(no!=0)
	 {
	  int digi = no%10;
	  hmn.put(digi,hmn.getOrDefault(digi, 0)+1);
	  no= no/10;
	 }
	 
	// Unique frequency of digit	
	 System.out.println(hmn);
	 int getno=-1;
	 for(Map.Entry<Integer,Integer> ent: hmn.entrySet())	 
	 {	 
	  if(ent.getValue()==1)   // Main Line change from P6 File
	  {
		getno = ent.getKey();
	  }	  
	  }
	  System.out.println("First Unique Digit: "+getno);
	 }	 
    
    
    public void uniqueCharacter(String str)
    {
     HashMap<Character,Integer> hmc = new HashMap<Character,Integer>();
     for(char ch:str.toCharArray())
     {	 
     hmc.put(ch, hmc.getOrDefault(ch, 0)+1);
     }
	 System.out.println(hmc);
	 
	 // Unique frequency of character	
     char ch = ' ';
     for(Map.Entry<Character, Integer> ent: hmc.entrySet())
     {
      if(ent.getValue()==1)
      {
    	  ch = ent.getKey();
      }	  	 
     }	 
	  System.out.println("First Unique Character: "+ch);
    }
	public static void main(String[] args) {
		P07_UniqueCharacterDigitOccureace unq = new P07_UniqueCharacterDigitOccureace();
	    unq.uniqueDigit(5585599);
	    unq.uniqueCharacter("lollyy");
	}

}
