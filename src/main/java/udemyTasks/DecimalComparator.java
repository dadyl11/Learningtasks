package udemyTasks;

public class DecimalComparator {

  public boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

    int p = (int) (firstNumber * 1000);
    int q = (int) (secondNumber * 1000);

    if (p == q) {
      return true;
    } else {
      return false;
    }
  }

}
