package Recruitment.AgesCalculator.TestsWithAbstractClass;

import Recruitment.AgesCalculator.Cat;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CatTest extends CalculateAgesTest {

  @Override
  public void setAnimal() {
    this.calculateAge = new Cat();
  }

  private Object[] humanToAnimalYears() {
    return new Object[]{
        new Object[]{1, 15},
        new Object[]{2, 23},
        new Object[]{3, 27},
        new Object[]{4, 31},
        new Object[]{155, 635}
    };
  }

  private Object[] animalToHumanYears() {
    return new Object[]{
        new Object[]{8, 0.5},
        new Object[]{15, 1},
        new Object[]{17, 1.5},
        new Object[]{23, 2},
        new Object[]{27, 3},
        new Object[]{49, 8.5},
        new Object[]{55, 10}
    };
  }
}