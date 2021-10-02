package MultiThreading;

public class Test1 {

	public static void main(String[] args) {

		MyThread4 t = new MyThread4();
		
		t.start();
		
		System.out.println("Main method executed by Thread: " + Thread.currentThread().getName());
		
	}

}
