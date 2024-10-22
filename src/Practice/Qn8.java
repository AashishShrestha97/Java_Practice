package Practice;

import java.util.Scanner;

public class Qn8 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Write your first number: ");
	double num_1 = in.nextDouble();
	
	System.out.println("Write your second number: ");
	double num_2 = in.nextDouble();
	
	System.out.println("Enter an operator (+, -, /, *): ");
	char operator = in.next().charAt(0);
	
	double finalResult;
	
	switch (operator) {
	case '+':
		finalResult = num_1 + num_2;
		break;
	case '-':
		finalResult = num_1 - num_2;
		break;
	case '/':
		finalResult = num_1 / num_2;
		break;
	case '*':
		finalResult = num_1 * num_2;
		break;
	default:
		System.out.println("Invalid operators!!");
		return;
	}
	System.out.println("The result is " + finalResult);
	
	
}
}
