public class CalandarConverter {
    final static int pon = 1;
    final static int wt = 2;
    final static int sr = 3;
    final static int czw = 4;
    final static int piat = 5;
    final static int sob = 6;
    final static int nied = 7;


    public static String getDayName(int day) {//Jak dodać powyższe int-y?
        String dayName = "";
        switch (day) {
            case 1: dayName = "Poniedziałek";break;
            case 2: dayName = "Wtorek";break;
            case 3: dayName = "Sroda";break;
            case 4: dayName = "Czwartek";break;
            case 5: dayName = "Piątek";break;
            case 6: dayName = "Sobota";break;
            case 7: dayName = "Niedziela";break;
            default:dayName = "Ile według ciebie dnie ma tydzień?";break;
        }

        return dayName;
    }
}





