package recruitment.agesCalculator.helpers;

public class RoundNumbers {

  public double roundToHalf(double input) {
    if(input < 0.5){
      input = 0.5;
    }
    return Math.round(input * 2) / 2.0;
  }
}
