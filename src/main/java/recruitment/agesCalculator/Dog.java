package recruitment.agesCalculator;

import recruitment.agesCalculator.helpers.CalculateExactYearsNumber;
import recruitment.agesCalculator.helpers.RoundNumbers;
import recruitment.agesCalculator.helpers.ValidateParameters;

public class Dog implements CalculateAge {

  private ValidateParameters validateParameters = new ValidateParameters();
  private RoundNumbers round = new RoundNumbers();
  private CalculateExactYearsNumber calculateExactYearsNumber = new CalculateExactYearsNumber();

  @Override
  public int convertHumanYearsToAnimalYears(int humanYears) {
    validateParameters.validateYearsNumber(humanYears);
    if (humanYears > 2) {
      return 24 + (humanYears - 2) * 5;
    } else if (humanYears == 2) {
      return 24;
    } else {
      return 15;
    }
  }

  @Override
  public double convertAnimalYearsToHumanYears(int animalYears) {
    validateParameters.validateYearsNumber(animalYears);
    if (animalYears <= 15) {
      return round.roundToHalf(calculateExactYearsNumber.calculateExactNumberOfYearsLeft(animalYears, 0, 15));
    } else if (animalYears <= 24) {
      return 1 + round.roundToHalf(calculateExactYearsNumber.calculateExactNumberOfYearsLeft(animalYears, 15, 9));
    } else {
      return 2 + round.roundToHalf(calculateExactYearsNumber.calculateExactNumberOfYearsLeft(animalYears, 24, 5));

    }
  }
}
