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
public class CatsAgeTest {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  private CatsAge catsAge = new CatsAge();

  @Test
  @Parameters(method = "params")
  public void shouldReturnAnimalYears(int humanYears, int animalYears) {
    //given

    //when
    int actualAnimalYears = catsAge.calculateAnimalAge(humanYears);

    //then
    assertThat(actualAnimalYears, is(animalYears));
  }

  private Object[] params() {
    return new Object[]{
        new Object[]{1, 15},
        new Object[]{2, 23},
        new Object[]{3, 27},
        new Object[]{4, 31},
        new Object[]{155, 635}
    };
  }

  @Test
  public void shouldReturnException() {
    //given
    int humanYears = 0;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    catsAge.calculateAnimalAge(humanYears);
  }

  @Test
  public void calculateFromAnimalToHuman() {
  }
}