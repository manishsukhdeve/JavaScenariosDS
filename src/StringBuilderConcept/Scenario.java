package StringBuilderConcept;

public class Scenario {

	public static void main(String[] args) {

		// StringBuilder is exactly Same as StringBuffer (Including Constructors and Methods Also) Except the following Differences.
	
		// StringBuffer - Every Method Present In Stringbuffer Is Synchronized. At A Time Only One Thread Is Allow To Operate On Stringbuffer Object And Hence It Is Thread Safe.
		// Threads Are Required To Wait To Operate On Stringbuffer Object And Hence Relatively Performance Is Slow.
		// Introduced In 1.0 Version.
		
		// StringBuilder - No Method Present In Stringbuilder Is Synchronized. At A Time Multiple Thread Are Allowed To Operate On Stringbuilder Object And Hence It Is Not Thread Safe.
		// Threads Are Not Required To Wait To Operate On Stringbuilder Object And Hence Relatively Performance Is High.
		// Introduced In 1.5 Version.
		
		// String Vs StringBuffer Vs StringBuilder
		// If the Content is Fixed and won’t changed frequently then we should go for String.
		// If the Content is Not Fixed and keep on changing but Thread Safety is required then we should go for StringBuffer.
		// If the Content is Not Fixed and keep on changing but Thread Safety is Not required then we should go for StringBuilder

		// Method Chaining:
		// For most of the Methods in String, StringBuffer and StringBuilder the Return Types are the Same Type (String, StringBuffer and StringBuilder Objects) only.
		// Hence After Applying a Method on the Result we can Call Another Method which forms a Method Chaining. sb.m1().m2().m3().m4().m5()…..;
		// All these Method Calls will execute from Left to Right.
		
		StringBuffer sb = new StringBuffer();
		sb.append("Durga").append("Solution").reverse().insert(2, "xyz").delete(3, 7);
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Durga").append("Software").append("Solution").insert(2, "xyz").delete(7, 15).reverse().append("Hyd");
		System.out.println(sb1);
	}
}
