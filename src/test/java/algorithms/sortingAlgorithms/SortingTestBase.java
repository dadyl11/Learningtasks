package algorithms.sortingAlgorithms;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public abstract class SortingTestBase

{
    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() {
        //given
        int[] given = new int[]{7, 6, 5, 4, 3, 2, 1, 12};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 12};

        //when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        //then
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortBigArray() {
        //given
        int[] given = new int[100_000];
        int j = 0;
        for (int i = given.length - 1; i >= 0; i--) {
            given[j] = i;
            j++;
        }
        int[] expected = new int[100_000];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = i;
        }

        //when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        //then
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortArrayFilledWithRandomNumbers() {
        //given
        int[] given = new int[100_000];
        for (int i = 0; i < given.length - 1; i++) {
            given[i] = (int) (Math.random() * 100_001);
        }
        int[] expected = given.clone();
        Arrays.sort(expected);

        //when
        long startTime = System.currentTimeMillis();
        int[] result = getSortingMethod().sort(given);
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));

        //then
        Assert.assertArrayEquals(expected, (result));
    }
}
