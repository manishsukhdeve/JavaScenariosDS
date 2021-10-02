package Constructors;

public class ConstructorOverloading {
	
	public ConstructorOverloading(double d) {
		this (10);
		System.out.println("Double Argument Constructor calling");
	}

	public ConstructorOverloading(int i) {
		this ();
		System.out.println("Integer Arugument Constructor calling");
	}
	
	public ConstructorOverloading() {
		System.out.println("No Argument Constructor calling");
	}
	
	
	public static void main(String[] args) {

		ConstructorOverloading t1 = new ConstructorOverloading(10.0);
		
		ConstructorOverloading t2 = new ConstructorOverloading(10);
		
		ConstructorOverloading t3 = new ConstructorOverloading();
	}

}
