package co.edureka.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with? [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		Shape sh = null;
		//sh = new Shape("Yellow"); //Cannot instantiate the type Shape
		
		switch(shapeType) {
		 case 1:
			sh = new Rectangle("Blue", 12, 7);
			break;
		 case 2:
			sh = new Circle("Red", 7.6f);
			break;			
		 default:
			System.err.println("INVALID SHAPE TYPE SELECTED");
			return;
		}
		
		System.out.println("\n======================== SHAPE SELECTED :: " + sh.getClass().getSimpleName().toUpperCase() + " ========================\n");
		System.out.println("color of \""+sh.getClass().getSimpleName()+"\" = " + sh.getColor());
		sh.setColor("Black");
		
		sh.area();
	}
}
