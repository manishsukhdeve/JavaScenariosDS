package StringConcepts;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		// 1. Difference between String and StringBuffer Objects?
		// Once we created a StringBuffer Object we can Perform any Type of changes in the existing Object. 
		// This Changeable Nature is nothing but Mutability of StringBuffer Objects.

		StringBuffer sb = new StringBuffer("Durga ");
		sb.append("Software");
		System.out.println(sb);
		
		System.out.println("-------------------------");
		
		// 2. Difference between String and StringBuffer: == Operator Vs equals() method
		// In StringBuffer Class .equals() is not Overridden for Content Comparison Hence Object Class .equals() will be executed which is meant for Reference Comparison. 
		// Due to this if Objects are different equals() Returns false Event though Content is Same.
		
		StringBuffer sb1 = new StringBuffer("Durga");
		StringBuffer sb2 = new StringBuffer("Durga");
		
		System.out.println(sb1 == sb2); // false		// in stringbuffer == method for reference comparison. 
		System.out.println(sb1.equals(sb2)); // false	// in stringbuffer .equals method for reference comparison.
		
	}

}
