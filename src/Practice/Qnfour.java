package Practice;

public class Qnfour {
    public static void main(String[] args) {
        reverseString("Aashish");
    }

    static void reverseString(String a) {
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println();  
    }
}
