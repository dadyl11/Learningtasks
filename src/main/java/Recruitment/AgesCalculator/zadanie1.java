package Recruitment.AgesCalculator;

import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zadanie1 {

  public int solution(int A, int B) {

    List<Integer> squares = new ArrayList<>();
    List<Integer> counter = new ArrayList<>();

    double firstSquare = 0;
    for (int i = B; i >= A; i--) {
      double x = sqrt(i);
      if (x == (int) x) {
        firstSquare = i;
        squares.add(i);
        //break;
      }
    }

    for (int i : squares) {
      int count = 0;
      for (int j = i; j >= A; j--) {
        while (sqrt(j) == (int) sqrt(j)) {
          count = count + 1;
          j = (int) sqrt(j);
          counter.add(count);
        }
      }
    }
    return Collections.max(counter);
  }

  public static void main(String[] args) {
    System.out.println(new zadanie1().solution(6000, 7000));
  }
}