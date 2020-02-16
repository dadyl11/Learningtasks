package udemyTasks.controlFlow;

public class NumberPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(-3223322));
  }

  private static boolean isPalindrome(int number) {
    int reverse = 0;
    if (number < 0) {
      number = number * (-1);
    }

    int temNumber = number;
    while (temNumber > 0) {
      int lastDigit = temNumber % 10;
      System.out.println("last digit" + lastDigit);
      reverse *= 10;
      reverse += lastDigit;
      System.out.println("reverse" + reverse);
      temNumber = temNumber / 10;

    }
    return number == reverse;
  }
}
