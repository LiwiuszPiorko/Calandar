public class ConverterTest {
    public static void main(String[] args) {


        for (int i = 1; i <= 7; i++) {//
            String days = CalandarConverter.getDayName(i);
            System.out.println(i+" dzień tygodnia to "+ days);
        }//To ewidentnie nie.
    }
}
