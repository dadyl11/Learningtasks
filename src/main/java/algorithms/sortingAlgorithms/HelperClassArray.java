package algorithms.sortingAlgorithms;

/**
 * Created by Kamil on 06.05.2018.
 */
public class HelperClassArray {

    public static int[] prepareArrayFilledWithRandomNumbers(int size) {
        int[] arrayToFill = new int[size];
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = (int) (Math.random() * 1001);
        }
        return arrayToFill;
    }
}
