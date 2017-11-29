package printingstatements;

import java.util.Scanner;

public class SmartCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

char operator;
double number1, number2, answer = 0;
System.out.println("enter the operator you wish to use");

Scanner in = new Scanner(System.in); 
operator = in.next().charAt(0);

System.out.println("Your first number is");
number1 = in.nextDouble();
System.out.println("Your second number");
number2 = in.nextDouble();
switch(operator) {

case '+':
answer = number1 + number2;
break;
case '-' :
answer = number1 - number2;
break;
case  '*':
answer = number1 * number2;
break;
case  '/': 
answer = number1 / number2;
break;
default:
	System.out.println("Invalid operator");
	break;
}
System.out.println("Your answer is " + answer);			
	}
}
