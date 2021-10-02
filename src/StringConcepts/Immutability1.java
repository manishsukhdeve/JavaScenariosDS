package StringConcepts;

public class Immutability1 {

	public static void main(String[] args) {

		String s1 = "durga";			// s1 - SCP
		String s2 = s1.toString();		// s2 - SCP = s1
		String s3 = s1.toLowerCase();	// s3 - SCP = s1
		String s4 = s1.toUpperCase();	// s4 - Heap
		
		System.out.println(s1 == s2);	// true
		System.out.println(s1 == s3);	// true
		System.out.println(s1 == s4);	// false
		
	}

}
