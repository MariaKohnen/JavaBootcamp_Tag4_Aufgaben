import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneHundredTest {
@Test
    void countAndJudge_when_4_should_4(){
    assertEquals("4",
            OneHundred.countAndJudge(4));
    }
    @Test
    void countAndJudge_when_3_should_Hash3(){
        assertEquals("#3",
                OneHundred.countAndJudge(3));
    }
    @Test
    void countAndJudge_when_15_should_HashDollar15(){
        assertEquals("#$15",
                OneHundred.countAndJudge(15));
    }


}