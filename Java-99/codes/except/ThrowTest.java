package co.edureka.java.except;

class Calculator{
	public int divNum(int x, int y) {
		if(y == 0) {
			//throw new ArithmeticException();			
			throw new ArithmeticException("cannot divide an int by 0");
		}
		return x/y;
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		try {
			System.out.println("result = " + calc.divNum(10, 0));
		}catch(Exception ex) {
			System.out.println("message = " + ex.getMessage());
			System.out.println(ex.toString());
		}
	}
}
