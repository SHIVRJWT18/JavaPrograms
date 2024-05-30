package SampleCodesDemo;

public class CountCharacterOccurancesOfString 
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
	
	public static void main(String[] args) 
	{
		CountCharacterOccurancesOfString c = new CountCharacterOccurancesOfString();

		System.out.println(c.GetNoOfCharacterOccurance("Rajawat",'a'));

	}

}
