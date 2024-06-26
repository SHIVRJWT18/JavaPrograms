package CollectionFrmwrk;

import java.util.Comparator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CSOwithAge_StudentsClassDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void GetDNSOStudentsAgeDemo()
	{
		StudentsClassDemo scd1 = new StudentsClassDemo("Puneet",31);
		StudentsClassDemo scd2 = new StudentsClassDemo("Rakesh",41);
		StudentsClassDemo scd3 = new StudentsClassDemo("Abhishek",29);
		StudentsClassDemo scd4 = new StudentsClassDemo("Puneet",31);
		StudentsClassDemo scd5 = new StudentsClassDemo("Tannu",45);
		StudentsClassDemo scd6 = new StudentsClassDemo("Sonu",51);
		
		TreeSet ts1 = new TreeSet(); // DNSO wrto Age
	    ts1.add(scd1);
	    ts1.add(scd2);
	    ts1.add(scd3);
	    ts1.add(scd4);
	    ts1.add(scd5);
	    ts1.add(scd6);
		
	    System.out.println("DNSO AGE: "+ts1);
	    
		TreeSet ts2 = new TreeSet(new CustomCSO()); // CSO wrto Name
	    ts2.add(scd1);
	    ts2.add(scd2);
	    ts2.add(scd3);
	    ts2.add(scd4);
	    ts2.add(scd5);
	    ts2.add(scd6);
		
	    System.out.println("CSO Name: "+ts2);
	}

 }

 class StudentsClassDemo implements Comparable
 {		
	String sname ;
	int sage;
	
	StudentsClassDemo(String name,int age)
	{
	 this.sname = name;
	 this.sage = age;
	}
	

	public String toString()
	{
		return sname+"--"+sage;
	}
	
    public int compareTo(Object o1)
    {
     StudentsClassDemo sa2 = (StudentsClassDemo)o1;
     
     int age1 = this.sage;
     int age2 = sa2.sage;
     
     if(age1<age2)
     {
      return -1; 
     }
     else if(age1>age2)
     {
      return +1;	 
     }
     else
     {
      return 0;	 
     }	 
    }





 }  

 class CustomCSO implements Comparator
 {

	 public int compare(Object o1,Object o2)
	 {
	  StudentsClassDemo sa1 = (StudentsClassDemo)o1;
	  StudentsClassDemo sa2 = (StudentsClassDemo)o2;
	     
	     String name1 = sa1.sname;
	     String name2 = sa2.sname; 
	     
	     return name2.compareTo(name1);
	 }

}
