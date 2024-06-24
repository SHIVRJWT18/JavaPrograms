package JavaTestPackage;

public class DemoTest 
{

	
	
	public static void main(String[] args) {
		String sp = "http://";
		String port = "192.168.1.38:4723";
		String s = "http://192.168.1.38:4723";
		
		String[] sar = s.split("//");
		String[] de = sar[1].split(":");
		System.out.println(de[0]);
		
		String str = "Spring is best and Summer is best also winter is best";
		
	    String[] sarr = str.split("\\W");
		
		System.out.println(sarr[0]);
		System.out.println(sarr[1]);
		System.out.println(sarr[2]);
		
		System.out.println(sarr[3]);
		System.out.println(sarr[4]);
		for(String word1:sarr)
		{	
		String word2 = word1.toLowerCase();
		System.out.println(word2);
	}}
}
