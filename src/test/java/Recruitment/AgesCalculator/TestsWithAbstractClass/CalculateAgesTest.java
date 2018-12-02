package Recruitment.AgesCalculator.TestsWithAbstractClass;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import Recruitment.AgesCalculator.CalculateAge;
import junitparams.Parameters;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public abstract class CalculateAgesTest {

  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  CalculateAge calculateAge;

  public abstract void setAnimal();

  @Before
  public void beforeTest() {
    setAnimal();
  }

  @Test
  @Parameters(method = "humanToAnimalYears")
  public void shouldConvertHumanYearsToAnimal(int humanYears, int animalYears) {
    //given

    //when
    int actualAnimalYears = calculateAge.convertHumanYearsToAnimalYears(humanYears);

    //then
    assertThat(actualAnimalYears, CoreMatchers.is(animalYears));
  }

  @Test
  @Parameters(method = "animalToHumanYears")
  public void shouldConvertAnimalYearsToHuman(int animalYears, double humanYears) {
    //given

    //when
    double actualHumanYears = calculateAge.convertAnimalYearsToHumanYears(animalYears);

    //then
    assertThat(actualHumanYears, is(humanYears));
  }

  @Test
  public void shouldReturnExceptionCausedByWrongHumanYearsNumber() {
    //given
    int humanYears = 0;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    calculateAge.convertHumanYearsToAnimalYears(humanYears);
  }

  @Test
  public void shouldReturnExceptionCausedByWrongAnimalYearsNumber() {
    //given
    int humanYears = -1;
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage("years number cannot be less or equal to zero");

    //when
    calculateAge.convertAnimalYearsToHumanYears(humanYears);
  }
}
