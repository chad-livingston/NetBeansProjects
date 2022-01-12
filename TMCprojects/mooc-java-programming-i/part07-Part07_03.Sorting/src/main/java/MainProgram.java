
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // indices:       0  1  2  3  4  5  6
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfTheSmallest = startIndex;
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
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

        //System.out.println("index1: " + swapperValue);
        //System.out.println("index2: " + firstIndexValue);

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            //System.out.println("i: " + i);
            int smallestIndex = indexOfSmallestFrom(array, i);
            //System.out.println("SI: " + smallestIndex);
            swap(array, i, smallestIndex);

            System.out.println(Arrays.toString(array));
        }
    }

}
