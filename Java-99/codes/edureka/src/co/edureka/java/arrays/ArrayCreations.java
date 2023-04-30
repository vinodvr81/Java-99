package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 87;
		
		System.out.println("array size = " + marks.length);
		System.out.println(Arrays.toString(marks));
		
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+"     ");
		}
		System.out.println();
		
		for(int n : marks) {
			System.out.print(n+"     ");
		}
		System.out.println();
		
		double []salaries = new double[10];
		System.out.println(Arrays.toString(salaries));
		
		boolean status[] = new boolean[8];
		System.out.println(Arrays.toString(status));
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		for(String str : names) {
			System.out.print(str + "     ");
		}
	}

}
