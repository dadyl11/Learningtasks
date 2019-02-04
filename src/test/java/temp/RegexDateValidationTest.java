package temp;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegexDateValidationTest {

  @Test
  void checkDateFrmat() {
    //given
    String date = "12/24/2019";

    //when
    boolean result = new RegexDateValidation().checkDateFrmat(date);

    //then
    assertThat(result, is(true));
  }

  @Test
  void checkDateFrmat2() {
    //given
    String date = "12/30/2019";

    //when
    boolean result = new RegexDateValidation().checkDate2(date);

    //then
    assertThat(result, is(true));
  }
}