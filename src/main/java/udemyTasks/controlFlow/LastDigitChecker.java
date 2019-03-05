package udemyTasks.controlFlow;

public class LastDigitChecker {

  public static void main(String[] args) {

  }

  public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
    if (!isValid(firstNum) || !isValid(secondNum) || !isValid(thirdNum)) {
      return false;
    }
    int lastDigitFirst = firstNum % 10;
    int lastDigitSecond = secondNum % 10;
    int lastDigitThird = thirdNum % 10;

    if (lastDigitFirst == lastDigitSecond || lastDigitFirst == lastDigitThird || lastDigitSecond == lastDigitThird) {
      return true;
    }
    return false;
  }

  public static boolean isValid(int parameter) {
    if (parameter < 10 || parameter > 1000) {
      return false;
    }
    return true;
  }
}
