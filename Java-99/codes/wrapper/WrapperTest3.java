package co.edureka.java.wrapper;

public class WrapperTest3 {

	public static void main(String[] args) {
		int n1 = 25;
		Integer n2 = n1; //auto-boxing
		int n3 = n2; //auto-unboxing
		
		System.out.println(n1 + " | " + n2 + " | " + n3);
		
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf(23);
		
		Integer i3 = i1 + i2; //unboxing , addition, boxing
		System.out.println(i3);
	}
}