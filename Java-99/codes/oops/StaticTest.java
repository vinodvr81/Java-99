package co.edureka.java.oops;

public class StaticTest {
	static{
		System.out.println("inside static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}

	static{
		System.out.println("inside static block-2");
	}	
}
