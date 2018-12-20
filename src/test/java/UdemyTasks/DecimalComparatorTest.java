package UdemyTasks;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DecimalComparatorTest {

  @Test
  @Parameters(method = "param")
  public void areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber, boolean valid) {
    //when
    boolean decimalComparatorTest = new DecimalComparator().areEqualByThreeDecimalPlaces(firstNumber, secondNumber);

    //then
    assertThat(decimalComparatorTest, is(valid));
  }

  public Object[] param() {
    return new Object[]{
        new Object[]{12.333, 12.333, true},
        new Object[]{-3.1756, -3.175, true},
        new Object[]{1.756, 1.757, false},
        new Object[]{3.0, 3.0, true},
        new Object[]{12333, 12333, true}
    };
  }
}