package algorithms;

public class MersenneNumber {
/*
A number is said to be mersenne number if it is one less than a power of 2.
Example- 7 is a mersenne number as it is 2^3-1.Similarly 1023 is a mersenne number as it is 2^10-1.
 */
  public static void main(String[] args) {
  MersenneNumber mersenneNumber = new MersenneNumber();
    System.out.println(mersenneNumber.verifyMersenneNumber(127));
    //todo tests
  }

  public boolean verifyMersenneNumber(int number){
    int checkNumber = number + 1;
    int power = 0;
    boolean result = false;
    for (int i = 0; ; i++){
      power=(int)Math.pow(2,i);
      if (power > checkNumber)
      {
        break;
      }
      else if (power==checkNumber)
      {
        result = true;
      }
    }
    return result;
  }
}
