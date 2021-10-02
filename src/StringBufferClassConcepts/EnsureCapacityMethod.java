package StringBufferClassConcepts;

public class EnsureCapacityMethod {

	public static void main(String[] args) {

		// public void ensureCapascty(int capacity);
		// To Increase Capacity on Fly based on our Requirement.
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity()); // 1000
	}

}