
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeforrmatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();// This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E a H:m");// this is the formatter
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);// creating the String using date and formate
        System.out.println(myDate);
    }



}