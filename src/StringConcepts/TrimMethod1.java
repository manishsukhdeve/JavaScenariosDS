package StringConcepts;

public class TrimMethod1 {

	public static void main(String[] args) {

		// Trim method can't remove middle of the string space.
		
		String name = "Durga Soft";
		System.out.println(name.length());
		System.out.println(name.trim().length());
	}

}
