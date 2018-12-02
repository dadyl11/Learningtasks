package Recruitment.AgesCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CatTest {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  private Cat cat = new Cat();

  @Test
  @Parameters(method = "humanToAnimalYears")
  public void shouldConvertHumanYearsToAnimal(int humanYears, int animalYears) {
    //given

    //when
    int actualAnimalYears = cat.convertHumanYearsToAnimalYears(humanYears);

    //then
    assertThat(actualAnimalYears, is(animalYears));
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

  @Test
  @Parameters(method = "animalToHumanYears")
  public void shouldConvertAnimalYearsToHuman(int animalYears, double humanYears) {
    //given

    //when
    double actualHumanYears = cat.convertAnimalYearsToHumanYears(animalYears);

    //then
    assertThat(actualHumanYears, is(humanYears));
  }

  private Object[] animalToHumanYears() {
    return new Object[]{
        new Object[]{8, 0.5},
        new Object[]{15, 1},
        new Object[]{23, 2},
        new Object[]{17, 1.5},
        new Object[]{23, 2},
        new Object[]{27, 3},
        new Object[]{49, 8.5},
        new Object[]{55, 10}
    };
  }

  @Test
  public void shouldReturnException() {
    //given
    int humanYears = 0;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    cat.convertHumanYearsToAnimalYears(humanYears);
  }
}