package UdemyTasks;

public class LapYear {

  //todo test

  public static boolean isLapYear(int year) {
    if (year >= 1 && year <= 9999) {
      return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }
    return false;
  }
}
