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
public class DogAgeTest {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  private DogAge dogAge = new DogAge();

  @Test
  @Parameters(method = "humanToAnimalYears")
  public void shouldConvertHumanYearsToAnimal(int humanYears, int animalYears) {
    //given

    //when
    int actualAnimalYears = dogAge.convertHumanYearsToAnimalYears(humanYears);

    //then
    assertThat(actualAnimalYears, is(animalYears));
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

  @Test
  @Parameters(method = "animalToHumanYears")
  public void shouldConvertAnimalYearsToHuman(int animalYears, double humanYears) {
    //given

    //when
    double actualHumanYears = dogAge.convertAnimalYearsToHumanYears(animalYears);

    //then
    assertThat(actualHumanYears, is(humanYears));
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

  @Test
  public void shouldReturnException() {
    //given
    int humanYears = 0;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    dogAge.convertHumanYearsToAnimalYears(humanYears);
  }
}