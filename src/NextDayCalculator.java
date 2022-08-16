public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yeahTest) {
        String result;
        result = (dayTest+1) + CONCATENATION + monthTest + CONCATENATION + yeahTest;
        return result;
    }
}
