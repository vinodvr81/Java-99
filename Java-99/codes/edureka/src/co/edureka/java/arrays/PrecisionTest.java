package co.edureka.java.arrays;

public class PrecisionTest {

	public static void main(String[] args) {
		int total = 482;
		int noOfSubjects = 7;
		
		float avg = ((float)total) / noOfSubjects;
		System.out.println(avg);
		
		System.out.printf("%.2f", avg);
		System.out.println();
		
		System.out.printf("%.1f", avg);
		System.out.println();
		
		System.out.printf("%.3f", avg);
		System.out.println();
		
		System.out.printf("%.4f", avg);
		System.out.println();
	}

}
