package codegym;

import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testleapYear() {
        int year = 2022;
        boolean expected = false;

        boolean result = NextDayCalculator.leapYear(year);
        assertEquals(expected, result);
    }

    @Test
    void testnumberOfDaysInTheMonth() {
        int month = 7;
        int year = 2022;
        int expected = 31;

        int result = NextDayCalculator.numberOfDaysInTheMonth(month,year);
        assertEquals(expected, result);
    }

    @Test
    void testtheNextDay() {
            int year = 2022;
            int month = 7;
            int day = 30;
            String expected = "The Next day is: 31 7 2022";

            String result = NextDayCalculator.theNextDay(year,month,day);
        assertEquals(expected, result);
    }

    @Test
    void main() {
    }
}