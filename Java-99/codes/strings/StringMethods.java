package co.edureka.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		System.out.println("charAt(0) = " + str.charAt(0));
		System.out.println("charAt(14) = " + str.charAt(14));
		//System.out.println("charAt(15) = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		System.out.println();
		
		System.out.println("indexOf(\"e\") = " + str.indexOf("e"));
		System.out.println("indexOf(\"e\", start_index_1) = " + str.indexOf("e", 1));
		System.out.println("lastIndexOf(\"e\") = " + str.lastIndexOf("e"));
		System.out.println("indexOf(\"limi\") = " + str.indexOf("limi"));
		System.out.println("indexOf(\"java\") = " + str.indexOf("java")); //-1
		System.out.println();
		
		System.out.println("replace(char,char) = " + str.replace('e', '*'));
		System.out.println("toLowerCase() = " + str.toLowerCase());
		System.out.println("toUpperCase() = " + str.toUpperCase());
		System.out.println(str);
	}
}
