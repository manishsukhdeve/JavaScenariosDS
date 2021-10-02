package StringConcepts;

public class TestStringOne {

	public static void main(String[] args) {

		String s1 = new String ("You cannot change me");	// Two objects created, one in Heap area and one in SCP area
		String s2 = new String ("You cannot change me");	// Two objects created, one in Heap area and one in SCP area
		System.out.println(s1 == s2);	// false					
		
		String s3 = "You cannot change me";					// One object created in SCP area
		System.out.println(s1 == s3);	// false
		
		String s4 = "You cannot change me";					// One object created in SCP area
		System.out.println(s3 == s4);	// true	
		
		String s5 = "You cannot"+" change me";				// One object created in SCP area
		System.out.println(s4 == s5);	// true
		
		String s6 = "You cannot";							// One object created in SCP area
		String s7 = s6 + " change me";						// One Object created in Heap area
		System.out.println(s4 == s7);	// false
		
		final String s8 = "You cannot";						// One object created in SCP area						
		String s9 = s8 + " change me";						// One Object created in Heap area
		System.out.println(s4 == s9);	// false	
	}
}