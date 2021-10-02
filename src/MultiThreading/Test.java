package MultiThreading;

public class Test {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());	// main
		MyThread3 t = new MyThread3();
		System.out.println(t.getName());	// Thread-0
		Thread.currentThread().setName("Sumit Raut");
		System.out.println(Thread.currentThread().getName());	// Sumit Raut
		System.out.println(10/0);
		
	}

}
