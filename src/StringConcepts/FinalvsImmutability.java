package StringConcepts;

public class FinalvsImmutability {

	public static void main(String[] args) {

		// final Keyword applicable for Variables but not for Objects 
		// whereas Immutability Concept is applicable for Objects but not for Variables.
		// final and Immutability both are different Concepts.
		// By declaring a Reference Variable as final we won’t get any Immutability Nature but we can’t perform re-assignment for that Reference Variable.
		
		// String is Immutable 
		// StringBuffer is Mutable.
		
		final StringBuffer sb = new StringBuffer("durga ");
		sb.append("Software");
		System.out.println(sb);
		
		// sb = new StringBuffer("ravi");

		// final variable - right
		// final object - wrong
		// Immutable variable - wrong
		// Immutable object - right
	}

}
