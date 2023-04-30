
public class CharacterType {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65;
		System.out.println(c);
		System.out.println("hexa decimal value of 65 = " + Integer.toHexString(65));
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905'; //hindi
		System.out.println(c);
		
		c = '\u0c05'; //telugu
		System.out.println(c);
		
		c = '\u0D05'; //malayalam
		System.out.println(c);
		
		c = '\u4eca'; //Japanese
		System.out.println(c);
	}
}