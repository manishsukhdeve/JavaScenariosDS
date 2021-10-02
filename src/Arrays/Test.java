package Arrays;

public class Test {

	public static void main(String[] args) {

		Object [] a = new Object [10];
		a[0] = new Object ();
		a[1] = new String ("Manish");
		a[2] = new Integer (10);
		
		
		Number [] n = new Number [10];
		n[0] = new Integer(10);
		n[1] = new Double (10.5);
//		n[2] = new String ("Sumit");
		
		
		Runnable [] r = new Runnable[10];
		r[0] = new Thread();
		
		
		
		
	}

}
