package co.edureka.java.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Mark")); //true
		System.out.println(names.add("Mark")); //false
		System.out.println(names.add("Sanjay")); //true
		names.add("Praveen");
		names.add("Anirudh");
		names.add("Bharath");
		names.add("Rahul");
		
		System.out.println("no of participants = " + names.size());
		System.out.println(names);		

		names.add(null);
		System.out.println(names);
	}
}