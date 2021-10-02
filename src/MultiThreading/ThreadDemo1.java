package MultiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		t1.start();
		System.out.println("main method()");
//		t1.start();
	}

}
