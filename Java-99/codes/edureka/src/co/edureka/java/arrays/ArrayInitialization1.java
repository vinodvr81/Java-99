package co.edureka.java.arrays;

public class ArrayInitialization1 {

	public static void main(String[] args) {
		int[][] n = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		System.out.println("size of array = " + n.length);
		System.out.println();
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		/*-- display array elements in a matrix form using nested for loop --*/
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+"      ");
			}
			System.out.println();
		}
		System.out.println();
		
		/*-- display array elements in a matrix form using nested enhanced for loop --*/
		for(int[] x : n) {
			for(int j : x) {
				System.out.print(j+"      ");
			}
			System.out.println();
		}		
	}

}
