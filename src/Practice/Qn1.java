package Practice;

import java.util.Scanner;

public class Qn1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Write a number to check: ");
		int num = in.nextInt();
		
		
		String num1 = (num % 2 == 0) ? "The number is an even" : "The number is odd";
		System.out.println(num1);
		
//		if(num % 2 == 0) {
//			System.out.println("The number " + num + " is an even number");
//		} 
//		else if(num % 2 != 0) {
//			System.out.println("The number " + num + " is a odd number");
//		}else {
//			System.out.println("The number is invalid");
//		}
	}
	
}
