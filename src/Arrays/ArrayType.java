package Arrays;

public class ArrayType {
	
	public static void main(String[] args) {
		
		int [] x = new int [0];					// class [I
		
//		int [] [] x = new int [2] [4];			// class [[I
		
//		double [] x = new double [2];			// class [D
		
//		double [] [] x = new double [2] [3];	// class [[D
		
//		float [] x = new float [3];				// class [F
		
//		boolean [] x = new boolean [2];			// class [Z
		
//		short [] x = new short [2];				// class [S
		
//		byte [] x = new byte [3];				// class [B
		
//		int [] x = new int [-2];				// java.lang.NegativeArraySizeException: -2
		
		
		
		System.out.println(x.getClass());
		
		System.out.println(x.getClass().getName());
		
		System.out.println(args.length);
		
	}

}
