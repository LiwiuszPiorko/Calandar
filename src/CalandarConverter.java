public class CalandarConverter {
    final static int PON = 1;
    final static int WT = 2;
    final static int SR = 3;
    final static int CZ = 4;
    final static int PIAT = 5;
    final static int SOB = 6;
    final static int NIED = 7;


    public static String getDayName(int day) {//Jak dodać powyższe int-y?
        String dayName = "";
        switch (day) {
            case PON: dayName = "Poniedziałek";break;
            case WT: dayName = "Wtorek";break;
            case SR: dayName = "Sroda";break;
            case CZ: dayName = "Czwartek";break;
            case PIAT: dayName = "Piątek";break;
            case SOB: dayName = "Sobota";break;
            case NIED: dayName = "Niedziela";break;
            default:dayName = "Ile według ciebie dnie ma tydzień?";break;
        }

        return dayName;
    }
}





