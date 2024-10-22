package Practice;
import java.util.Scanner;

public class Qn4 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a decimal number: ");
	        double number = in.nextDouble();

	        long roundedNumber = Math.round(number);

	        System.out.println("The rounded number is: " + roundedNumber);
	        
	        in.close();
	    }
	}

