package Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {

		int [][][] x = new int [2][][];
		
		x[0] = new int [3][];
		x[0][0] = new int [1];
		x[0][1] = new int [2];
		x[0][2] = new int [3];
		
		x[1] = new int [2][2];
		
		x[0][0][0] = 10;
		x[0][1][0] = 20;
		x[0][1][1] = 30;
		x[0][2][0] = 40;
		x[0][2][1] = 50;
		x[0][2][2] = 60;
		
		x[1][0][0] = 70;
		x[1][0][1] = 80;
		x[1][1][0] = 90;
		x[1][1][1] = 100;
		
		
		System.out.println(x[0][0][0]);
		System.out.println(x[0][1][0]);
		System.out.println(x[0][1][1]);
		System.out.println(x[0][2][0]);
		System.out.println(x[0][2][1]);
		System.out.println(x[0][2][2]);
		
		System.out.println(x[1][0][0]);
		System.out.println(x[1][0][1]);
		System.out.println(x[1][1][0]);
		System.out.println(x[1][1][1]);
		
	
	}

}
