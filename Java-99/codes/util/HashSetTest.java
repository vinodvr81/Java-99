package co.edureka.java.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Mark")); //true
		System.out.println(names.add("Mark")); //false
		System.out.println(names.add("Sanjay")); //true
		names.add("Praveen");
		names.add("Anirudh");
		names.add("Bharath");
		names.add("Rahul");
		
		System.out.println("no of participants = " + names.size());
		System.out.println(names);	
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		names.add(null);
		System.out.println(names);
	}
}