package StringConcepts;

public class Immutability {

	public static void main(String[] args) {

		// Important Conclusions about String - Immutability
		
		String s1 = new String ("durga");	// one object in Heap area and another in SCP area
		
		String s2 = s1.toUpperCase();		// Object created in Heap area
				
		String s3 = s1.toLowerCase();		// Object refer to Heap area	
		
		System.out.println(s1 == s2); // false
		
		System.out.println(s1 == s3); // true
	}

}
