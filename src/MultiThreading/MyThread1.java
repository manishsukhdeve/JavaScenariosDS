package MultiThreading;

public class MyThread1 extends Thread {
	
//	public void run() {
//		System.out.println("No-org run method");
//	}
//	
//	public void run (int i) {
//		System.out.println("Int-org run method");
//	}
	
//	===================================================
	
//	public void start() {
//		System.out.println("start Method()");
//	}
//	
//	public void run() {
//		System.out.println("run Method()");
//	}
	
//	===================================================
	
	public void start() {
		super.start();
		System.out.println("start Method()");
	}
	
	public void run() {
		System.out.println("run Method()");
	}
	
}
