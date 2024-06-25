package CollectionFrmwrk;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SetDemo 
{

	@Test
	public void HashSetDemo()
	{
		HashSet hs = new HashSet();
		hs.add("Rinku");
		hs.add('d');
		hs.add(7.58);
		hs.add("Puneet");
		hs.add(null);
		hs.add("Tannu");
		
		System.out.println("HashSet: "+hs);  // Insertion order not preserved and based on HashTable
		System.out.println(hs.add("Puneet1")); // Dublicates are not allowed add() method return just false
		System.out.println(hs.add("Puneet"));
		System.out.println("UpdatedHashSet: "+hs);
				
	}
	
	@Test
	public void LinkedHashSetDemo()
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Rakesh");
		lhs.add(600);
		lhs.add('e');
		lhs.add(null);
		lhs.add("Abhishek");
		lhs.add("Shayam");
		
		System.out.println("LinkedHashSet: "+lhs);  // Insertion Order is preserved and based on HashTable
		System.out.println(lhs.add("Mayank")); 
		System.out.println(lhs.add("Shayam")); // Dublicates are not allowed add() method return just false
		System.out.println("UpdatedLinkedHashSet: "+lhs);
	}
}
