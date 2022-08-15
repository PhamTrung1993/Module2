package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testCheckTriangle() {
        double aside = 2;
        double bside = 2;
        double cside = 2;
        String expected = "This is an equilateral triangle";
        String result = Triangle.CheckTriangle(aside,bside,cside);
        assertEquals(expected,result);
    }
}