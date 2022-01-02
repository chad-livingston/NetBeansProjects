
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfTheSmallest = 0;
        int counter = 0;
        int smallest = array[0];
        for (int num : array) {

            if (num < smallest) {
                indexOfTheSmallest = counter;

            }
            counter++;
        }

        return indexOfTheSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfTheSmallest = 0;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallest) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;

    }

    public static void swap(int[] array, int index1, int index2) {
        int firstIndexValue = array[index1];
        int secondIndexValue = array[index2];
        int swapperValue = secondIndexValue;
        secondIndexValue = firstIndexValue;

        array[index1] = swapperValue;
        array[index2] = firstIndexValue;

    }

}
