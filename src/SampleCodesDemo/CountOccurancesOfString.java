package SampleCodesDemo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurancesOfString 
{

	public int GetNoOfCharacterOccurance(String str,char ch)
	{
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
		 if(str.charAt(i)==ch)
		 {
			 count = count+1;
		 }
 
		}
		return count;
	}
	
	public void GetNoOfWordOccurance(String str)
	{		
	    String[] sarr = str.split(" ");
		
		Map<String,Integer> countmaps = new HashMap<>();
	    
		for(String wrd : sarr)
	    {
	     String word = wrd.toLowerCase();
	     
	     countmaps.put(word,countmaps.getOrDefault(word, 0)+1);	 	      
	    }
		System.out.println(countmaps);
		
		for(Map.Entry<String, Integer> entry : countmaps.entrySet())
		{
		 if(entry.getValue() > 1)
		 {
		  System.out.println(entry.getKey()+"......."+entry.getValue()+" times");	 
		 }
		}
	
	}
	
	public static void main(String[] args) 
	{
		CountOccurancesOfString c = new CountOccurancesOfString();

		System.out.println(c.GetNoOfCharacterOccurance("Rajawat",'a'));
		
		c.GetNoOfWordOccurance("Spring is best and Summer is best also winter is best");
		
		
		

	}

}



