package Arrays;

public class length {
	
	public static void main(String[] args) {
		
//		int [] x = new int [6];
		
//		int [] x = {10, 20, 30, 40, 50};
		
		int [][] x = {{10, 20}, {30, 40}};

		System.out.println(x.length);		// 2
		System.out.println(x[0].length);	// 2
		
		String s0 = "Manish"; 
		System.out.println(s0.length());	// 6
		
		String [] s = {"Manish"};
		System.out.println(s.length);		// 1
		
		String [] s1 = {"Manish", "Pundlikrao", "Sukhdeve"};	
		System.out.println(s1.length);		// 3
		
		int [][] p = new int [6][3];
		System.out.println(p.length);		//6
		System.out.println(p[0].length);	//3
		
		
		
		
	}

}
