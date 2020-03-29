package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort implements SortingMethod {

    public static void main(String[] args) {
        int[] inputArray = HelperClassArray.prepareArrayFilledWithRandomNumbers(12);
        System.out.println(Arrays.toString(inputArray));
        int[] sortedArray = new BubbleSort().sort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1 - i); j++) {
                swapNumberIfOrderIsNotCorrect(array, j);
            }
        }
        return array;
    }

    public static void swapNumberIfOrderIsNotCorrect(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
