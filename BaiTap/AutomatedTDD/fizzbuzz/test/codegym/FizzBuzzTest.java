package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testcheckFizzBuzz() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void convertZeroToHundred() {
    }

    @Test
    void testNumbersIntoLetters() {
        int number = 1;
        String expected = "Một";

        String result = FizzBuzz.numbersIntoLetters(number);
        assertEquals(expected,result);
    }
}