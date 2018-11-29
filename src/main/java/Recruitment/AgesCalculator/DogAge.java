package Recruitment.AgesCalculator;

public class DogAge implements CalculateAge {

  private ValidateParameters validateParameters = new ValidateParameters();

  @Override
  public int calculateAnimalAge(int humanYears) {
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
  public double calculateFromAnimalToHuman(int animalYears) {
    validateParameters.validateYearsNumber(animalYears);
    if (animalYears <= 15) {
      return 1;
    } else if (animalYears <= 24) {
      return 2;
    } else {
      return 2 + ((double) animalYears - 24) / 5;
    }
  }
}
