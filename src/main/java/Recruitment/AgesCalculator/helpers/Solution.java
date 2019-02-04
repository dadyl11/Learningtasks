package Recruitment.AgesCalculator.helpers;
import static com.sun.xml.internal.fastinfoset.tools.PrintTable.printArray;

import java.util.*;
public class Solution {

  //static void printArray(int N, int SUM, int K)
  public int[] solution(int N) {
    int SUM = 0;
    int K = N;
    // smallest possible sum
    int minSum = (N * (N + 1)) / 2;

    // largest possible sum

    int maxSum = (N * K) - (N * (N - 1)) / 2;

//        if (minSum > SUM || maxSum < SUM) {
//    System.out.println("Not Possible");
//    return;
//  }

    // Creating array with
    // minimum possible sum.
    int arr[] = new int[N];
    for (int i = 1; i <= N; i++) {
      arr[i-1] = i;
    }

    int sum = minSum;

    // running the loop from last because the
    // array is sorted and running from last
    // will give largest numbers
    for (int i = N; i >= 1; i--) {

      // replacing i with K, Note arr[i] = i
      int x = sum + (K - i);
      if (x < SUM) {
        sum = sum + (K - i);

        // can't be incremented further
        arr[i] = K;

        // to maintain uniqueness
        K--;
      } else {

        // directly replacing with a suitable
        // element to make sum as given sum
        arr[i] += (SUM - sum);
        sum = SUM;
        break;
      }
    }

//        for (int i = 1; i <= N; i++)
//      System.out.print(arr[i] + " ");
    return arr;
  }

  // Driver code
  public static void main(String[] args) {
    int N = 3, SUM = 15, K = 8;
    System.out.println(Arrays.toString(new Solution().solution(4)).toString());
  }
}
