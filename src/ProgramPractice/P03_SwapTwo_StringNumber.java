package ProgramPractice;


public class P03_SwapTwo_StringNumber {


public void SwapString()
{
 String s1 = "Hi";
 String s2 = "Good Morning";
 System.out.println("before Swaping: "+s1+".."+s2);
 s1 =  s1+s2;
 s2 = s1.substring(0,(s1.length()-s2.length()));
 s1 = s1.substring(s2.length());
 System.out.println("after Swaping: "+s1+".."+s2);
}

public void SwapNumberbyAdd()
{
 int no1 = 148;
 int no2 = 97;
 System.out.println("before Swaping: "+no1+".."+no2);
 no1 = no1+no2;
 no2 = no1-no2;
 no1 = no1-no2;
 
 System.out.println("after Swaping: "+no1+".."+no2);

}

public void SwapNumberbyMultiply()
{
 int no1 = 73;
 int no2 = 16;
 System.out.println("before Swaping: "+no1+".."+no2);
 no1 = no1*no2;
 no2 = no1/no2;
 no1 = no1/no2;
 
 System.out.println("after Swaping: "+no1+".."+no2);
}

public static void main(String[] args) 
{
 P03_SwapTwo_StringNumber sn = new P03_SwapTwo_StringNumber();
 sn.SwapString();
 sn.SwapNumberbyAdd();
 sn.SwapNumberbyMultiply();
}

}
