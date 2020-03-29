package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

    public static void main(String[] args) {
        int[] input = {10, 4, 8, 12, 22, 7};
        int[] output = new MergeSort().sort(input);
        System.out.println(Arrays.toString(output));
    }

    public int[] sort(int[] array) {
        mergeSort(0, array.length - 1, array);
        return array;
    }

    public void mergeSort(int leftIndex, int rightIndex, int[] array) {
        if (leftIndex < rightIndex) {
            int middlePoint = leftIndex + (rightIndex - leftIndex) / 2;
            mergeSort(leftIndex, middlePoint, array);
            mergeSort(middlePoint + 1, rightIndex, array);
            mergeParts(leftIndex, middlePoint, rightIndex, array);
        }
    }

    public void mergeParts(int leftIndex, int middle, int rightIndex, int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = leftIndex; i <= rightIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = leftIndex;
        int k = leftIndex;
        int j = middle + 1;
        while (i <= middle && j <= rightIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
