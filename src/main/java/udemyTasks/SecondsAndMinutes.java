package udemyTasks;

public class SecondsAndMinutes {

  public static void main(String[] args) {

  }

  public static String getDurationString(long minutes, long second){
    if (minutes < 0 || second < 0 || second > 59){
      return "Invalid value";
    }
    long hours = minutes / 60;
    long remainingMinutes = minutes % 60;
    return hours + "h " + remainingMinutes + "min " + second + "s";
  }
  public static String getDurationString(long second){
    if (second < 0){
      return "Invalid value";
    }
    long  minutes = second / 60;
    long remainingSeconds = second % 60;

    return getDurationString(minutes, remainingSeconds);
  }
}
