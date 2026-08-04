package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class P06_DigitOccurenceOfNumber {
    // Count frequency
	public void digitOccurOfNumber(int num)
    {
     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();	
     while(num!=0)
     {
      int temp = num%10;	 
      hm.put(temp, hm.getOrDefault(temp, 0)+1);	
      num = num/10;
     }
     System.out.println("Get your digits occurence: "+hm);
    
	
	// Find highest frequency
	int maxcount=0;
	int getno = -1;
	
	for(Map.Entry<Integer, Integer> ent: hm.entrySet())
	{
	 if(ent.getValue()>maxcount)
	 {
		 maxcount = ent.getValue();
		 getno = ent.getKey();
	 }	 
	}
	 System.out.println("Highest Frequency Digit: " + getno);
     System.out.println("Frequency of digit: " + maxcount);
   }
	public static void main(String[] args) {
		P06_DigitOccurenceOfNumber dos = new P06_DigitOccurenceOfNumber();
		dos.digitOccurOfNumber(489993);
	}

}
