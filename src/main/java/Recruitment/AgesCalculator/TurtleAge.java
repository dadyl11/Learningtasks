package Recruitment.AgesCalculator;

public class TurtleAge implements CalculateAge {

  private ValidateParameters validateParameters = new ValidateParameters();

  @Override
  public int calculateAnimalAge(int humanYears) {
    validateParameters.validateYearsNumber(humanYears);
    if (humanYears > 2) {
      return 17 + (humanYears - 2);
    } else if (humanYears == 2) {
      return 17;
    } else {
      return 15;
    }
  }

  @Override
  public double calculateFromAnimalToHuman(int animalYears) {
    validateParameters.validateYearsNumber(animalYears);
    if (animalYears <= 15) {
      return 1;
    } else if (animalYears <= 17) {
      return 2;
    } else {
      return 2 + ((double) animalYears - 17);
    }
  }
}
