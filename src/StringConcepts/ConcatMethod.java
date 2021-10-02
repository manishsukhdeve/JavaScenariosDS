package StringConcepts;

public class ConcatMethod {

	public static void main(String[] args) {

		// public String concat(String s):
		// The Overloaded ‘+’ and ‘+=’ Operators Acts as Concatenation Operation Only.
		
		String s = "Durga ";
		s = s.concat("Software");
		System.out.println(s);
		
		String s1 = "Manish ";
		s1 = s1+"Software";
		System.out.println(s1);
		
		String s2  = "Selenium ";
		s2 += "Software";
		System.out.println(s2);
	}

}
