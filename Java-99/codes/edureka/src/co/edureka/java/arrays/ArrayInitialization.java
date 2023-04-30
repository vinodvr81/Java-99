package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {95,87,63,78,93,72,86};
		
		System.out.println(Arrays.toString(marks));
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		/*-- array iteration using for loop --*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-" + (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		/*-- array iteration using enhanced for loop (for..each loop) from Java 5 --*/
		System.out.print("marks obtained  ---->   ");
		for(int mark : marks) {
			System.out.print(mark + " | ");			
		}
		System.out.println();
		
		System.out.println(marks[6]);
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
