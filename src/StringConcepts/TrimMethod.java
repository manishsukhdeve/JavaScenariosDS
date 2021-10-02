package StringConcepts;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {

		// Important Methods of String class: trim() method and its use case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter city name:- ");
		String name = sc.nextLine().toLowerCase().trim();
		
		if (name.equalsIgnoreCase("hyderabad"))
		{
			System.out.println("Hello Hyderabadi");
		}
		else if (name.equals("mumbai"))
		{
			System.out.println("Hello Mumbaikar");
		}
		else if (name.equals("pune"))
		{
			System.out.println("Hello Punekar");
		}
		else
			System.out.println("Please enter city name");
	}

}
