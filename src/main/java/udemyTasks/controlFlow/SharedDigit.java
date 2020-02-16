package udemyTasks.controlFlow;

public class SharedDigit {


  public static void main(String[] args) {
    hasSharedDigit(12, 43);
  }

  public static boolean hasSharedDigit(int start, int end) {
    if (start > 99 || start < 10 || end > 99 || end < 10) {
      return false;
    }
    int firDigitStart = start % 10;
    int secondDigitStart = start / 10;
    int firDigitEnd = end % 10;
    int secondDigitEnd = end / 10;
    if (firDigitStart == firDigitEnd || firDigitStart == secondDigitEnd || secondDigitStart == firDigitEnd || secondDigitStart == secondDigitEnd) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean hasSharedDigit2(int firstNumber, int secondNumber) {
    if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
      return false;
    }

    boolean hasSharedDigit = false;

    while (firstNumber > 0 && !hasSharedDigit) {
      int currentFirstNumberDigit = firstNumber % 10;
      int secondNumberCopy = secondNumber;
      firstNumber /= 10;
      while (secondNumberCopy > 0 && !hasSharedDigit) {
        int currentSecondNumberDigit = secondNumberCopy % 10;

        if (currentFirstNumberDigit == currentSecondNumberDigit) {
          hasSharedDigit = true;
        }

        secondNumberCopy /= 10;
      }
    }
    return hasSharedDigit;
  }
}
