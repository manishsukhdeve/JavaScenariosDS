package StringBufferClassConcepts;

public class InsertMethod {

	public static void main(String[] args) {

	//		public StringBuffer insert(int index, String s);
	//		public StringBuffer insert(int index, int i);
	//		public StringBuffer insert(int index, float f);
	//		public StringBuffer insert(int index, double d);
	//		public StringBuffer insert(int index, boolean b);
	//		public StringBuffer insert(int index, Object o);
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2, "xyz");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("abcdefgh");
		sb1.insert(2, true);
		System.out.println(sb1);
		
		StringBuffer sb3 = new StringBuffer("abcdefgh");
		sb3.insert(2, 10);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer("abcdefgh");
		sb4.insert(2, 10.1);
		System.out.println(sb4);
		
		StringBuffer sb5 = new StringBuffer("abcdefgh");
		sb5.insert(2, 10.123456789);
		System.out.println(sb5);
	}

}
