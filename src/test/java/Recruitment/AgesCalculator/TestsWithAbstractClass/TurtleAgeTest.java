package Recruitment.AgesCalculator.TestsWithAbstractClass;

import Recruitment.AgesCalculator.TurtleAge;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TurtleAgeTest extends CalculateAgesTest {

  @Override
  public void setAnimal() {
    this.calculateAge = new TurtleAge();
  }

  private Object[] humanToAnimalYears() {
    return new Object[]{
        new Object[]{1, 15},
        new Object[]{2, 17},
        new Object[]{3, 18},
        new Object[]{4, 19},
        new Object[]{155, 170}
    };
  }

  private Object[] animalToHumanYears() {
    return new Object[]{
        new Object[]{15, 1},
        new Object[]{17, 2},
        new Object[]{16, 1.5},
        new Object[]{18, 3},
        new Object[]{20, 5},
        new Object[]{55, 40}
    };
  }
}