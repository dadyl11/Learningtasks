package Recruitment.AgesCalculator;

public class CatsAge implements CalculateAge {

  public static void main(String[] args) {
    CatsAge trttr = new CatsAge();

    System.out.println(trttr.calculateFromAnimalToHuman(52));
  }

  private ValidateParameters validateParameters = new ValidateParameters();

  @Override
  public int calculateAnimalAge(int humanYears) {
    validateParameters.validateYearsNumber(humanYears);
    if (humanYears > 2) {
      return 23 + (humanYears - 2) * 4;
    } else if (humanYears == 2) {
      return 23;
    } else {
      return 15;
    }
  }

  @Override
  public double calculateFromAnimalToHuman(int animalYears) {
    validateParameters.validateYearsNumber(animalYears);
    if (animalYears <= 15) {
      return 1;
    } else if (animalYears <= 23) {
      return 2;
    } else {
      return 2 + ((double) animalYears - 25) / 55;
    }
  }

  private void validateYears(int animalYears) {
    if (animalYears <= 0) {
      throw new IllegalArgumentException("Years number cannot be less or equal to zero");
    }
  }
}