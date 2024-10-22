package Practice;
import java.util.Scanner;

public class Qn5 {
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter a number: ");
		        int n = in.nextInt();

		        int sum = 0;

		        for (int i = 1; i <= n; i++) {
		            sum += i; 
		        }

		        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

		        in.close();
		    }
		}


