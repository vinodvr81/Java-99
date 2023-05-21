package co.edureka.java.util;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>(); 
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		
		bank.put("Sanjay", null);
		System.out.println(bank);
		
		bank.put(null, 2500f); //java.lang.NullPointerException
		
	}

}
