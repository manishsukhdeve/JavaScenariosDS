package StringBufferClassConcepts;

public class StringBufferConstructor2 {

	public static void main(String[] args) {

		// StringBuffer default capacity is 16.
		
		StringBuffer sbc = new StringBuffer();
		System.out.println(sbc.capacity()); // 16
		
		// StringBuffer sb = new StringBuffer(int initialCapacity);
		// Creates an Empty StringBuffer Object with the specified Initial Capacity.
		
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity()); // 1000
		
		// StringBuffer sb1 = new StringBuffer(String s);
		// Creates an Equivalent StringBuffer Object for the given String Object with
		// capacity = s.length()+16
		
		StringBuffer sb1 = new StringBuffer("durga");
		System.out.println(sb1.capacity()); // durga 5 + 16 = 21
		
		
	}

}
