package Practice;

public class Qnthree {
    public static void main(String[] args) {
        primeNumbers(6);
    }

    static void primeNumbers(int a) {
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number " + a + " is a prime number");
        } else {
            System.out.println("The given number " + a + " is not a prime number");
        }
    }
}
