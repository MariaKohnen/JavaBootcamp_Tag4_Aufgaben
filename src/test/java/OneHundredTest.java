import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneHundredTest {
    @Test
    void checkNumber_whenDivisionThree_shouldHash() {
        assertEquals("#", OneHundred.checkNumber(9));
    }

    @Test
    void checkNumber_whenNoDivisionThree_shouldNoHash() {
        assertEquals("", OneHundred.checkNumber(14));
    }

    @Test
    void checkNumber_whenDivisionFive_shouldDollar() {
        assertEquals("$", OneHundred.checkNumber(10));
    }

    @Test
    void checkNumber_whenNoDivisionFive_shouldNoDollar() {
        assertEquals("", OneHundred.checkNumber(17));
    }

    @Test
    void checkNumber_whenDivisionThreeAndFive_shouldHashAndDollar() {
        assertEquals("#$", OneHundred.checkNumber(15));
    }

    @Test
    void checkNumber_whenNoDivisionThreeAndFive_shouldNoHashAndDollar() {
        assertEquals("", OneHundred.checkNumber(19));
    }
}