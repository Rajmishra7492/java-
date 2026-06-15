import java.util.Calendar;
// calaender is a abstract class

public class CalendarType {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));

        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" +c.get(Calendar.MINUTE)+ ":"+ c.get(Calendar.SECOND));
    }
}