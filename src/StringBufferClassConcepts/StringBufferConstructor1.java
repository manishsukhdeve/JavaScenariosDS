package StringBufferClassConcepts;

public class StringBufferConstructor1 {

	public static void main(String[] args) {
		
		// 		Note:
		//		Every Method Present in StringBuffer is synchronized.
		//		Hence at a Time Only One Thread is allowed to operate on StringBuffer Object.
		//		It increases waiting Time of Threads and Creates Performance Problems.
		//		To Overcome this Problem SUN People introduced StringBuilder Class in 1.5 Version.

		// StringBuffer sb = new StringBuffer();
		// Creates an Empty StringBuffer Object with Default Initial Capacity 16.
		// Once StringBuffer reaches Max Capacity then a New StringBuffer Object will be created with new capacity = (current capacity + 1) * 2
		
		// Default capacity + 1 * 2 = 34 (16 + 1 * 2 = 34)
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity()); // 16
		sb.append("q");
		System.out.println(sb.capacity()); // 34 (capacity 34 + 1 * 2 - 70)
		sb.append("rstuvwxyzabcdefghijkl");
		System.out.println(sb.capacity()); // 70
		
	}

}
