package StringBufferClassConcepts;

public class AppendMethod {

	public static void main(String[] args) {

	// 		All below methods are overloaded methods - 
		
	//		public StringBuffer append(String s);
	//		public StringBuffer append(int i);
	//		public StringBuffer append(float f);
	//		public StringBuffer append(double d);
	//		public StringBuffer append(boolean b);
	//		public StringBuffer append(Object o);
	//		:::::::::::::::::::::::::::::::::::::::::::::::
	//		:::::::::::::::::::::::::::::::::::::::::::::::

		StringBuffer sb = new StringBuffer();
		sb.append("PI value is ");
		sb.append(3.14);
		sb.append(" It is exactly ");
		sb.append(true);
		System.out.println(sb);
		
	}

}
