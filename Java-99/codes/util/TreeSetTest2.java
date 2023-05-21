package co.edureka.java.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Set<Product> products = new TreeSet<Product>(new ProductComparator());

		Product prod1 = new Product(3478, "Mobile");
		Product prod2 = new Product(1234, "Memory");
		Product prod3 = new Product(4752, "Keyboard");
		Product prod4 = new Product(1001, "Mouse");
		Product prod5 = new Product(7415, "Cabinet");
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		
		for(Product prod : products) {
			System.out.println(prod);
		}
		
		System.out.println();
		Iterator<Product> it = products.iterator();
		while(it.hasNext()) {
			Product prod = it.next();
			System.out.println(prod);
		}
	}
}

class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {		
		return o1.getProductId() - o2.getProductId();
	}
	
}
