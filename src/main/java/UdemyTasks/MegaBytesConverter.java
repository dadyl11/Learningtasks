package UdemyTasks;

public class MegaBytesConverter {

  //todo test

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int megaBytes = kiloBytes / 1024;
      int kiloBytesValue = kiloBytes % 1024;
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesValue + " KB");
    }
  }
}
