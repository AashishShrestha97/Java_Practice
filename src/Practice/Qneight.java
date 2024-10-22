package Practice;

public class Qneight {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int valueToFind = 7;

        boolean contains = containsValue(numbers, valueToFind);
        System.out.println("Array contains " + valueToFind + ": " + contains);
    }

    static boolean containsValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }
}
