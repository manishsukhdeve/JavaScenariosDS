package Arrays;

public class ClassName {
	
	public static void main(String[] args) {
		
		int [] x = new int [3];		// one dimensional array								// class [I
		
//		int [] [] x = new int [4][3];	// two dimensional array							// class [[I
		
//		int [] [] [] x = new int [3] [4] [5];	// three dimensional array					// class [[[I
		
//		int [] [] [] [] x = new int [1] [2] [3] [4];	// four dimensional array			// class [[[[I
		
//		int [] [] [] [] [] x = new int [1] [2] [3] [4] [5];		// five dimensional array	// class [[[[[I
		
		System.out.println(x.getClass());
		
		System.out.println(x.getClass().getName());
		
		System.out.println(x);
		
		System.out.println(x[0]);
		
	}

}
