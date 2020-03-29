package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort implements SortingMethod {
    public static void main(String[] args) {
        int[] inputArray = HelperClassArray.prepareArrayFilledWithRandomNumbers(12);
        System.out.println(Arrays.toString(inputArray));
        int[] sortedArray = new SelectionSort().sort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp_min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[temp_min]) {
                    temp_min = j;
                }
            }
            int temp_value = array[i];
            array[i] = array[temp_min];
            array[temp_min] = temp_value;
        }
        return array;
    }
}
