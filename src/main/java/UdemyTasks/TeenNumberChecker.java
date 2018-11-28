package UdemyTasks;

import java.util.ArrayList;
import java.util.List;

public class TeenNumberChecker {

  public static boolean hasTeen(int firstParam, int secondParam, int thirdParam) {

    List<Integer> list = new ArrayList<>();
    list.add(firstParam);
    list.add(secondParam);
    list.add(thirdParam);
    boolean result = false;

    for (int i : list) {
      if (i >= 13 && i <= 19) {
        result = true;
      }
    }
    return result;
  }
}
