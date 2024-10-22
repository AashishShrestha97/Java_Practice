package Practice;
import java.util.Arrays;

public class Qnseven {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] joinedArray = joinArrays(array1, array2);

        System.out.println(Arrays.toString(joinedArray));
    }

    static int[] joinArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        return result;
    }
}
