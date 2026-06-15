
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        /*
         * java.time ----- package for date & time in java (from java 8 on wards)
         * Before java 8, java.utill package used to hold the date and time classes now
         * these classes are deprecated
         * How java stores a data ?
         * Date in java is stored in the form of a long number this long number hold the
         * number of millisecond passes since 1 jan 1970.
         */
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

        // is it safe to store the number of millisecond in variable of type long.
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // System.out.println(d.getYear());
        // System.out.println(d.getSeconds());
        // System.out.println(d.getTimezoneOffset());
        System.out.println(d.hashCode());

    }
}
