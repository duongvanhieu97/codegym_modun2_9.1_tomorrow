import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2022")
    void testDay1Month1Yeah2022() {
        int dayTest = 1;
        int monthTest = 1;
        int yeahTest = 2022;
        String expected = "2/1/2022";
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yeahTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/1/2022")
    void testDay31Month1Yeah2022() {
        int dayTest = 31;
        int monthTest = 1;
        int yeahTest = 2022;
        String expected = "1/2/2022";
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yeahTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 30/4/2022")
    void testDay30Month4Yeah2022() {
        int dayTest = 30;
        int monthTest = 4;
        int yeahTest = 2022;
        String expected = "1/5/2022";
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yeahTest);
        assertEquals(expected,result);
    }
}
