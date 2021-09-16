import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {
    FizzBuzzConverter fizzBuzz = null;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzzConverter();
    }

    @Test
    public void fizzbuzz_shouldReturn_FIZZ_if_number_is_multiples_of_3() {
        Assertions.assertEquals("Fizz", fizzBuzz.convert(3));
        Assertions.assertEquals("Fizz", fizzBuzz.convert(6));
        Assertions.assertEquals("Fizz", fizzBuzz.convert(9));
    }


    @Test
    public void fizzbuzz_shouldReturn_BUZZ_if_number_is_multiples_of_5() {
        Assertions.assertEquals("Buzz", fizzBuzz.convert(5));
        Assertions.assertEquals("Buzz", fizzBuzz.convert(10));
        Assertions.assertEquals("Buzz", fizzBuzz.convert(25));
    }


    @Test
    public void fizzbuzz_shouldReturn_FIZZBUZZ_if_number_is_multiples_of_3_and_multiples_of_5() {
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(15));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(30));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(60));
    }

    @Test
    public void fizzbuzz_shouldReturn_Number_if_number_is_neither_multiple_of_3_or_5_or_both() {
        Assertions.assertEquals("1", fizzBuzz.convert(1));
        Assertions.assertEquals("17", fizzBuzz.convert(17));
        Assertions.assertEquals("43", fizzBuzz.convert(43));
    }

    @Test
    public void fizzbuzz_shouldReturn_expected_result_for_first_20_numbers() {

        List<String> expectedResults = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");

        for (int i = 0; i < expectedResults.size(); i++) {
            String expected = expectedResults.get(i);
            String actual = fizzBuzz.convert(i + 1);

            Assertions.assertEquals(expected, actual);
        }
    }
}
