package StringBufferClassConcepts;

public class CapacityMethod {

	public static void main(String[] args) {

		// public int capacity();
		
		StringBuffer sb = new StringBuffer("Durga");
		System.out.println(sb.capacity());  // durga 5 + 16 = 21
		
		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity());
		
		StringBuffer sbc = new StringBuffer();
		System.out.println(sbc.capacity()); // 16
		
		// StringBuffer sb = new StringBuffer(int initialCapacity);
		// Creates an Empty StringBuffer Object with the specified Initial Capacity.
		
		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity()); // 1000
		
		// StringBuffer sb1 = new StringBuffer(String s);
		// Creates an Equivalent StringBuffer Object for the given String Object with
		// capacity = s.length()+16
	}

}
