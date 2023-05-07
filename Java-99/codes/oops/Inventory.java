package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		//prod.productId = 101; //compilation error
		prod.setProductId(524163);
		prod.setProductName("Mobile");
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		System.out.println();
		
		System.out.println("\"prod is of type --> " + prod.getClass().getName());
		System.out.println("\"prod is of type --> " + prod.getClass().getSimpleName());
		System.out.println("hashCode(prod) = " + prod.hashCode());
		System.out.println("hashCode(prod) in hexa_decimal_form = " + Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod); //toString()
	}

}
