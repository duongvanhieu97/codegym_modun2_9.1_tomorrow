public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    private static final String FIRSTOFMONTH = "1";

    public static String getNextDay(int dayTest, int monthTest, int yeahTest) {
        String result;
        int lastOfMonth = getLastOfMonth(monthTest, yeahTest);
        if (dayTest == lastOfMonth && !checkLastOfYear(dayTest, monthTest)) {
            result = FIRSTOFMONTH + CONCATENATION + (++monthTest) + CONCATENATION + yeahTest;
        } else if (checkLastOfYear(dayTest, monthTest)) {
            return FIRSTOFMONTH + CONCATENATION + FIRSTOFMONTH + CONCATENATION + ++yeahTest;
        } else {
            result = (++dayTest) + CONCATENATION + monthTest + CONCATENATION + yeahTest;

        }
        return result;
    }

    private static int getLastOfMonth(int monthTest, int yeahTest) {
        int lastOfMonth = 0;
        switch (monthTest) {
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
            case 2:
                return dayMonth2(yeahTest);
            default:

        }
        return lastOfMonth;
    }

    static boolean checkPrimeYear(int yeahTest) {
        return yeahTest % 4 == 0 && yeahTest % 100 != 0 || yeahTest % 400 == 0;
    }

    static int dayMonth2(int yeahTest) {
        boolean check = checkPrimeYear(yeahTest);
        if (check) {
            return 29;
        }
        return 28;
    }

    static boolean checkLastOfYear(int dayTest, int monthTest) {
        return dayTest == 31 && monthTest == 12;
    }
}
