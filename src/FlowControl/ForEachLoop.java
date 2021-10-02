package FlowControl;

public class ForEachLoop {

	public static void main(String[] args) {

		int [] x = {10,20,30,40};
		
//		Normal for Loop:
//		for (int i=0; i<x.length; i++)
//		{
//			System.out.println(x[i]);
//		}
		
//		For Each Loop (Enhanced for loop)
		for (int x1 : x)
		{
			System.out.println(x1);
		}
	}

}
