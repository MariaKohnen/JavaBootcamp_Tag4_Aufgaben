import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {

    @Test
    void isGreaterThanZero_whenNumber0_shouldFalse() {
        assertFalse(Novice.isGreaterThanZero(0));
    }

    @Test
    void isGreaterThanZero_whenNumberMinus_shouldFalse() {
        assertFalse(Novice.isGreaterThanZero(-1));
    }

    @Test
    void isGreaterThanZero_whenNumberTwo_shouldTrue() {
        assertTrue(Novice.isGreaterThanZero(2));
    }


    //sqrNumber

    @Test
    void sqrNumber_whenNumber4_should16() {
        assertEquals(16, Novice.sqrNumber(4));
    }
}