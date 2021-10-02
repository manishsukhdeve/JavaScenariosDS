package StringBufferClassConcepts;

public class DeleteCharAt {

	public static void main(String[] args) {

		// public StringBuffer deleteCharAt(int index);
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		
		sb.deleteCharAt(2);
		
		System.out.println(sb);
	}

}
