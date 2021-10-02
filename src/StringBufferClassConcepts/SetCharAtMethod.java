package StringBufferClassConcepts;

public class SetCharAtMethod {

	public static void main(String[] args) {

		// public void setCharAt(int index, char ch);
		// Replaces the Character Present at specified Index with the provided Character
		
		StringBuffer sb = new StringBuffer("Java");
		sb.setCharAt(0, 'Y');
		System.out.println(sb);
	}

}
