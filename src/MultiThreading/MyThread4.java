package MultiThreading;

public class MyThread4 extends Thread 
{
	public void run () 
	{
		System.out.println("run methid executed by Thread: " + Thread.currentThread().getName());
	}

}
