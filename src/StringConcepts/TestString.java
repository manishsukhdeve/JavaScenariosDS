package StringConcepts;

public class TestString {

	public static void main(java.lang.String[] args) {
		
		// 1. Difference between String and StringBuffer Objects?
		// Once we created a String Object we can’t Perform any changes in the existing Object. 
		// If we are trying to Perform any changes with those changes a New Object will be created. 
		// This non-changeable Nature is nothing but immutability.
		
		String s = new String("Durga");
		s.concat("Software"); // not assigned to the any object so new object with no reference variable and this object is eligible for the garbage collector
		System.out.println(s);
		
		System.out.println("-----------------------------");
		
		// 2. Difference between String and StringBuffer: == Operator Vs equals() method
		// In String Class .equals() is Overridden for Content Comparison Hence if the Content is Same .equals() Returns True Even though Objects are Different.
		
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		
		System.out.println(s1 == s2);		// false// == operator is always for reference comparison  
		System.out.println(s1.equals(s2));	// true	// .equals method is for content comparison.
		
		System.out.println("-----------------------------");
		
		// 3. String Objects Creation : Heap and String Constant Pool(SCP) Part-1
		
		String ss1 = new String("Durga");	// two objects are created one in Heap and another in SCP (String Constant Pool)
		String ss2 = new String("Durga");	// two objects are created one in Heap and another in SCP (String Constant Pool)
		
		String ss3 = "Durga";	// one object is created in the SCP (String Constant Pool)
		String ss4 = "Durga";	// one object is created in the SCP (String Constant Pool)
		
		String ss5 = new String("Durga ");	// two object created, one in Heap area and another in SCP
		ss5.concat("Software");				// one object is created in SCP and one in Heap area (Durga Software) but is object is eligible for garbage collector.
		ss5 = ss5.concat("Solution");		// one object is created in SCP and one in Heap area (Durga Solution) 
		System.out.println(ss5);	// Durga Solution
		
		System.out.println("-----------------------------");
		
		// 4. String Objects Creation : Heap and String Constant Pool(SCP) Part-2
		
		String ss6 = new String ("Spring ");	// Two Objects are created in Heap and SCP area
		ss6.concat("Fall");						// Two objects are created in Heap and SCP area but Heap area object is eligible for Garbage collector
		String ss7 = ss6.concat("Winter");		// Two objects are created in Heap and SCP
		ss7.concat("Summer");					// Two objects are created in Heap and SCP area but Heap area object is eligible for Garbage collector
		System.out.println(ss6);	// Spring
		System.out.println(ss7);	// Spring Winter
		
		System.out.println("-----------------------------");
		
		
	}

}
