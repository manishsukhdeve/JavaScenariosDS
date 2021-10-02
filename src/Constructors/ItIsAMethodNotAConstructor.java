package Constructors;

public class ItIsAMethodNotAConstructor {
	
	void ItIsAMethodNotAConstructor() {		// Method or Function.
		System.out.println("It is a Method not a Constructor");
	}

	public static void main(String[] args) {

		ItIsAMethodNotAConstructor t1 = new ItIsAMethodNotAConstructor();	// Object
		
		t1.ItIsAMethodNotAConstructor();	// It is a Method not a Constructor
	}

}
