package Recruitment.AgesCalculator;

public class DogAge implements CalculateAge {

  @Override
  public int caclulateAnimalAge(int humanYears) {
    if (humanYears <= 0) {
      throw new IllegalArgumentException(humanYears + " cannot be less or equal to zero");
    }
    if (humanYears > 2) {
      return 23 + (humanYears - 2) * 5;
    } else if (humanYears == 2) {
      return 24;
    } else {
      return 15;
    }
  }

  @Override
  public double calculateFromAnimalToHuman(int animalYears) {
    return 0;
  }
}
