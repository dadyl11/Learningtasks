package UdemyTasks;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TeenNumberCheckerTest {

  @Parameters(method = "params")
  @Test
  public void hasTeen(int firstParam, int secondParam, int thirdParam, boolean valid) {
    //when
    boolean hasTeenTest = new TeenNumberChecker().hasTeen(firstParam, secondParam, thirdParam);
    //then
    assertThat(hasTeenTest, is(valid));
  }

  private Object[] params() {
    return new Object[]{
        new Object[]{9, 99, 19, true},
        new Object[]{23, 15, 43, true},
        new Object[]{22, 34, 55, false},
        new Object[]{15, 44, 55, true},
        new Object[]{65, 65, 13, true}
    };
  }
}