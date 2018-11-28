package Recruitment.AgesCalculator;

public class ValidateParameters {

  protected void convertFirstHumanYear(int years) {
    if (years <= 0) {
      throw new IllegalArgumentException("years number cannot be less or equal to zero");
    }
  }
}
