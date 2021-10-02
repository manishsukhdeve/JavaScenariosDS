package FlowControl;

public class InsideLabeledBlock {

	public static void main(String[] args) {

		int x = 10;
		
		l1:
		{
			System.out.println("Begin");
			if (x == 10)
				break l1;
			
			System.out.println("end");
		}
		System.out.println("Hello");
		}
	}