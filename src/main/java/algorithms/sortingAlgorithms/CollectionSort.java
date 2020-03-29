package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class CollectionSort implements SortingMethod {

    public static void main(String[] args) {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] output = new CollectionSort().sort(input);
        System.out.println(Arrays.toString(output));
    }

    public int[] sort(int[] table) {
        return Arrays.stream(table).sorted().toArray();
    }
}