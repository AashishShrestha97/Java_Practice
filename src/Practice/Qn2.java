package Practice;

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a letter to check: ");
        String word = in.nextLine();

        char firstChar = word.toLowerCase().charAt(0);

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println("The letter " + firstChar + " is a vowel.");
        } else if (Character.isLetter(firstChar)) {
            System.out.println("The letter " + firstChar + " is a consonant.");
        } else {
            System.out.println("The input is not a valid letter.");
        }

        in.close();
    }
}
