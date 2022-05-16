package shapefactory;

import java.util.Scanner;

public class UserInput {
	Scanner scan = new Scanner(System.in);

	public String input() {
		System.out.println("Please choose a shape - Square, Rectangle or Triangle");
		String input = scan.nextLine();
		return input;
	}
}
