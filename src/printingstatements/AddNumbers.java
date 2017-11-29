package printingstatements;

import java.util.Scanner;


public class AddNumbers {

	public static void main(String args[]) {
		float x, y, z, a, b, c;
		System.out.println("Enter two integers to calclate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		a = x - y;
		b = x * y;
		c = x / y;
		System.out.println("Sum of entered integers = "+z);
		System.out.println("Sum of entered integers = "+a);
		System.out.println("Sum of entered integers = "+b);
		System.out.println("Sum of entered integers = "+c);
		
	}

}
