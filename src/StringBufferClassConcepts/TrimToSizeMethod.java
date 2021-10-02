package StringBufferClassConcepts;

public class TrimToSizeMethod {

	public static void main(String[] args) {

		// public void trimToSize();
		// To De-allocate Extra allocated Free Memory.
		
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("ABC");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}

