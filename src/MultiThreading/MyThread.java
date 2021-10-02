package MultiThreading;

public class MyThread extends Thread {
	
	public void run () {
		for (int i=0; i<10; i++)
		{
			System.out.println("2. Child Thread");
		}
		
	}
	
}
