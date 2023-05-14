package co.edureka.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("is list empty = " + names.isEmpty());
		System.out.println("no of participants = " + names.size());
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		names.add("Sunil");
		names.add("Amith");
		names.add("Amarapali");
		names.add("Aravind");
		names.add("Sunil");
		names.add("Babu");
		names.add("Heenaben");
		names.add("Sunil");
		
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		names.add(1, "Kaijun");
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		names.set(1, "KAIJUN");
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Ajay) = " + names.indexOf("Ajay"));
		
		System.out.println(names.get(0));
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0)); //KAIJUN
		
		System.out.println(names + " | size= " + names.size());
		System.out.println();
		
		names.clear();
		
		System.out.println(names + " | size= " + names.size());
		System.out.println();
	}
}
