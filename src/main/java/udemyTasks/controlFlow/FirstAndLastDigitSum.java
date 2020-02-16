package udemyTasks.controlFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstAndLastDigitSum {

  private static final Logger logger = LogManager.getLogger(FirstAndLastDigitSum.class);

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(123));
  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    } else if (number < 10) {
      return number + number;
    }
    int firstDigit = number % 10;
    logger.info(String.valueOf(firstDigit));
    int tempNumber = number;
    logger.info(String.valueOf(tempNumber));

    while (tempNumber > 9) {
      tempNumber = tempNumber / 10;
      logger.info("temp number" + String.valueOf(tempNumber));

    }
    return firstDigit + tempNumber;
  }
}
