package StringConcepts;

public class EqualsIgnoreCase {

	public static void main(String[] args) {

		// public boolean equalsIgnoreCase(String s);
		// To Perform Content Comparison where Case is Not Important.
		// Note: In General we can use equalsIgnoreCase() to Compare User Names where Case is Not Important, 
		// whereas we can use equals() to Compare Passwords where Case is Important.
		
		// where case is ignored
		
		String s = "DURGA";
		System.out.println(s.equals("durga"));
		
		System.out.println(s.equalsIgnoreCase("durga"));
	}

}
