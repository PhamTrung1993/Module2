package codegym;

import org.junit.jupiter.api.DisplayName;
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

        int result = NextDayCalculator.lastDaysInTheMonth(month,year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/07/2022")
    void test30072022() {
            int year = 2022;
            int month = 7;
            int day = 31;
            String expected = "The Next day is: 1/8/2022";

            String result = NextDayCalculator.getNextDay(year,month,day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 01/02/2022")
    void test01022022() {
            int year = 2022;
            int month = 2;
            int day = 1;
            String expected = "The Next day is: 2/2/2022";

            String result = NextDayCalculator.getNextDay(year,month,day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 28/02/2022")
    void test28022022() {
        int year = 2022;
        int month = 2;
        int day = 28;
        String expected = "The Next day is: 1/3/2022";

        String result = NextDayCalculator.getNextDay(year,month,day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 31/12/2022")
    void test31122022() {
        int year = 2022;
        int month = 12;
        int day = 31;
        String expected = "The Next day is: 1/1/2023";

        String result = NextDayCalculator.getNextDay(year,month,day);
        assertEquals(expected, result);
    }

}