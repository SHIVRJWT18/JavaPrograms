package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class P05_CharacterOccurenceOfString {

	// Count frequency
	public void characterOccurOfString(String str)
	{
	 HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	 for(char ch:str.toCharArray())
	 {
	  hm.put(ch,hm.getOrDefault(ch, 0) + 1);	 
	 }		
	 
	 System.out.println("Get your characters occurence: "+hm);
		
	// Find highest frequency
	int maxcount =0; 
	char maxChar = ' ';
	for(Map.Entry<Character,Integer> ent: hm.entrySet())
	{
	 if(ent.getValue()>maxcount) {
		 maxcount = ent.getValue();
         maxChar = ent.getKey();	 
	 }	
	}
	 System.out.println("Highest Frequency Character: " + maxChar);
     System.out.println("Frequency of character: " + maxcount);
	 
	}
	public static void main(String[] args) {
		P05_CharacterOccurenceOfString cos = new P05_CharacterOccurenceOfString();
		cos.characterOccurOfString("programming");
	}

}
