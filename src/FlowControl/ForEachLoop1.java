package FlowControl;

public class ForEachLoop1 {

	public static void main(String[] args) {
		
		// 2 dimensional array

		int [][] x = {{10,20,30}, {40,50}};
		
//		for (int i=0; i<x.length; i++)
//		{
//			for (int j=0; j<x[i].length; j++)
//			{
//				System.out.println(x[i][j]);
//			}
//		}
		
		for (int [] x1 : x)
		{
			for (int x2 : x1)
			{
				System.out.println(x2);
			}
		}
	}

}
