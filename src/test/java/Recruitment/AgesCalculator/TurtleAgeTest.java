package Recruitment.AgesCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TurtleAgeTest {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  private TurtleAge turtleAge = new TurtleAge();

  @Test
  @Parameters(method = "humanToAnimalYears")
  public void shouldConvertHumanYearsToAnimal(int humanYears, int animalYears) {
    //given

    //when
    int actualAnimalYears = turtleAge.convertHumanYearsToAnimalYears(humanYears);

    //then
    assertThat(actualAnimalYears, is(animalYears));
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

  @Test
  @Parameters(method = "animalToHumanYears")
  public void shouldConvertAnimalYearsToHuman(int animalYears, double humanYears) {
    //given

    //when
    double actualHumanYears = turtleAge.convertAnimalYearsToHumanYears(animalYears);

    //then
    assertThat(actualHumanYears, is(humanYears));
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

  @Test
  public void shouldReturnException() {
    //given
    int humanYears = 0;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    turtleAge.convertHumanYearsToAnimalYears(humanYears);
  }
}