package StringConcepts;

public class CharAtMethod {

	public static void main(String[] args) {

		// public char (char is return type) charAt(int index); 
		// Returns the char locating at specified Index.
		
		String s = "durga";
		System.out.println(s.charAt(0));	// D
		System.out.println(s.charAt(3));	// g
		//System.out.println(s.charAt(30));	// StringIndexOutOfBoundsException
		//System.out.println(s.charAt(-1));	// StringIndexOutOfBoundsException
	}

}
