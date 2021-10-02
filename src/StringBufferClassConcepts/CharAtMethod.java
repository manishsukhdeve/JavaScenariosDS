package StringBufferClassConcepts;

public class CharAtMethod {

	public static void main(String[] args) {

		// public char charAt(int index);
		
		StringBuffer sb = new StringBuffer("Durga");
		System.out.println(sb.charAt(3));
		
		System.out.println(sb.charAt(30)); // StringIndexOutOfBoundsException:
		
	}

}
