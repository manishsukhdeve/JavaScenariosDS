package StringBufferClassConcepts;

public class DeleteMethod {

	public static void main(String[] args) {

		// public StringBuffer delete (int begin, int end);
		// To Delete Characters locating from Begin Index to End-1 Index.
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.delete(2, 5);
		System.out.println(sb);
		
	}

}
