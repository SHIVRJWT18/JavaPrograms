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
	}
}
