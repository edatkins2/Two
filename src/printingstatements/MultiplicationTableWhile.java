package printingstatements;

import java.util.Scanner;

public class MultiplicationTableWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int i = in.nextInt();
int y=1;
while(y<13) {
	System.out.println(i*y);
	y++;
}
	}

}
