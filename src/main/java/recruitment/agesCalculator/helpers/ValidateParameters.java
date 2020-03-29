package recruitment.agesCalculator.helpers;

public class ValidateParameters {

  public void validateYearsNumber(double years) {
    if (years <= 0) {
      throw new IllegalArgumentException("years number cannot be less or equal to zero");
    }
  }
}
