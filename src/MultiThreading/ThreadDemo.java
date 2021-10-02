package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();
//		t.start();
		t.run();
		
		for (int i=0; i<10; i++)
		{
			System.out.println("1. Main Thread");
		}
		
	}

}
