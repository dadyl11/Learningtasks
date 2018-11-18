package UdemyTasks;

public class DecimalComparator {

  public static void main(String[] args) {
    //boolean gg = areEqualByThreeDecimalPlaces(1.66666, 1.666789);
    //System.out.println(gg);

  }

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
