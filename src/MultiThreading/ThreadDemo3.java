package MultiThreading;

public class ThreadDemo3 {

	public static void main(String[] args) {

		MyThread2 t = new MyThread2();
		
		Thread t1 = new Thread(t);
		
		t1.start();
		
		System.out.println("Main Thread");
		
	}

}
