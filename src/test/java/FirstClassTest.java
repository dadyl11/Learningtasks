import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

class FirstClassTest {

  @org.junit.jupiter.api.Test
  void shouldReturnInputString() {
    //given
    String input = "kamil";

    //when
    String actual = new FirstClass().test(input);

    //then
    Assert.assertThat(input, is(actual));
    assertEquals(input, actual);
  }
}