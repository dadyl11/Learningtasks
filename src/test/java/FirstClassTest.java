import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

import UdemyTasks.FirstClass;
import org.junit.Assert;

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