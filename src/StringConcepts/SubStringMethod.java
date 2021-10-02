package StringConcepts;

public class SubStringMethod {

	public static void main(String[] args) {
		
		// there are two substring methods are availale 1st is with single argument and 2nd is with two arguments.

		// public String substring(int begin);
		// Returns Sub String from Begin Index to End of the String.
		
		String s = "abcdefg";
		System.out.println(s.substring(3));
		
		System.out.println("--------------------------");
		
		// public String substring(int begin, int end);
		// Returns the Characters from Begin Index to End-1 Index
		
		String s1 = "abcdefg";
		System.out.println(s1.substring(3,6));
		
	}

}
