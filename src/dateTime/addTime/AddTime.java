package dateTime.addTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Using Java 8 date-time library in CLASSPATH (package private) file,
// write a program that shows how you can add time to any time
// with respect to midnight on Jan. 1, 2000.
public class AddTime {
    public static void main(String[] args){
        LocalDateTime baseTime = LocalDateTime.of(2000, 1, 1, 0, 0);
        LocalDateTime newTime = baseTime.plusYears(25).plusMonths(5).plusDays(8).plusHours(1).plusMinutes(10); // June 9th, 2025, 01:10 am

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Base time: " + baseTime.format(formatter));
        System.out.println("New time:  " + newTime.format(formatter));
    }
}
