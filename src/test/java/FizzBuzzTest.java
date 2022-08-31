import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

@Test
    void FizzBuzzTestFor3() {

    int nummer = 3;

    String actual = FizzBuzz.fizzBuzz(nummer);

    assertEquals("fizz", actual);

}

    @Test
    void FizzBuzzTestFor5() {

        int nummer = 5;

        String actual = FizzBuzz.fizzBuzz(nummer);

        assertEquals("buzz", actual);

    }

    @Test
    void FizzBuzzTestFor4() {

        int nummer = 4;

        String actual = FizzBuzz.fizzBuzz(nummer);

        assertEquals("4", actual);

    }

    @Test
    void FizzBuzzTestFor15() {

        int nummer = 15;

        String actual = FizzBuzz.fizzBuzz(nummer);

        assertEquals("fizzBuzz", actual);

    }

}
