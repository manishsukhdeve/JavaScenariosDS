package Arrays;

public class AnonymousArray {
	
	public static void sum(int [] x) {
		
		int total = 0;
		
		for (int x1:x)
		{
			total = total + x1;
		}
		
		System.out.println("The Sum : " + total);
	}
	
	
	public static void main(String[] args) {
		
		sum (new int [] {10, 20, 30});	// nameless array
		
	}

}
