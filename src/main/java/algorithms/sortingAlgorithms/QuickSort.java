package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort implements SortingMethod {

    public static void main(String[] args) {
        int[] input = {10, 3, 5, 22, 8, 12};
        int[] output = new QuickSort().sort(input);
        System.out.println(Arrays.toString(output));
    }

    public int[] sort(int[] array) {
        quickSort(0, array.length - 1, array);
        return array;
    }

    public void quickSort(int leftIndex, int rightIndex, int[] arrayToSort) {
        int i = leftIndex;
        int j = rightIndex;
        int pivot = arrayToSort[leftIndex + (rightIndex - leftIndex) / 2];
        while (i <= j) {
            while (arrayToSort[i] < pivot) {
                i++;
            }
            while (arrayToSort[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j, arrayToSort);
                i++;
                j--;
            }
        }
        if (leftIndex < j)
            quickSort(leftIndex, j, arrayToSort);

        if (i < rightIndex)
            quickSort(i, rightIndex, arrayToSort);
    }

    private void exchangeNumbers(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}