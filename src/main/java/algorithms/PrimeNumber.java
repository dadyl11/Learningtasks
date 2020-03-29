package algorithms;

public class PrimeNumber {

  public static void main(String[] args) {
    PrimeNumber primeNumber = new PrimeNumber();
    System.out.println(primeNumber.isPrimNumber(16));
    System.out.println(primeNumber.isPrimNumber(17));
    //todo write tests
  }

  public boolean isPrimNumber(int number){
    boolean flag = false;
    int remainder;
    if (number <= 1){
      return flag;
    }
    for(int i=2;i<=number/2;i++)
    {
      remainder=number%i;
      if(remainder==0)
      {
        return flag;
      }
    }
    flag = true;
    return flag;
  }
}
