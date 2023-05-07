package co.edureka.java.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String str = "Java is a Programming language.";
		
		String[] words = str.split(" ");
		System.out.println("no of words in \""+str+"\" = " + words.length);
		System.out.println("---- the words in \""+str+"\" ----");
		for(String word : words) {
			System.out.println("----> " + word);
		}
		System.out.println();
		
		String str1 = String.join("*", words);
		System.out.println(str1);
	}

}
