package Recruitment.AgesCalculator.TestsWithAbstractClass;

import Recruitment.AgesCalculator.DogAge;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DogAgeTest extends CalculateAgesTest {

  @Override
  public void setAnimal() {
    this.calculateAge = new DogAge();
  }

  private Object[] humanToAnimalYears() {
    return new Object[]{
        new Object[]{1, 15},
        new Object[]{2, 24},
        new Object[]{3, 29},
        new Object[]{4, 34},
        new Object[]{155, 789}
    };
  }

  private Object[] animalToHumanYears() {
    return new Object[]{
        new Object[]{15, 1},
        new Object[]{24, 2},
        new Object[]{18, 1.5},
        new Object[]{23, 2},
        new Object[]{31, 3.5},
        new Object[]{49, 7},
        new Object[]{55, 8}
    };
  }
}