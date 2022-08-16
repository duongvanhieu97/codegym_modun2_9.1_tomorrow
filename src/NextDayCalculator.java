public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yeahTest) {
        String result;
        int lastOfMonth = getLastOfMonth(monthTest);
        if (dayTest == lastOfMonth) {
            result = 1 + CONCATENATION + (++monthTest) + CONCATENATION + yeahTest;
        }else {
            result = (dayTest+1) + CONCATENATION + monthTest + CONCATENATION + yeahTest;
        }
        return result;
    }

    private static int getLastOfMonth(int monthTest) {
        int lastOfMonth = 0;
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            default:

        }
        return lastOfMonth;
    }
}
