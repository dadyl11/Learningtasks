package recruitment.agesCalculator.helpers;

public class CalculateExactYearsNumber {

  public double calculateExactNumberOfYearsLeft(int animalYears, int animalYearsAlreadyCounted, int equivalentToHumanYears) {
    return ((double) animalYears - animalYearsAlreadyCounted) / equivalentToHumanYears;
  }
}
