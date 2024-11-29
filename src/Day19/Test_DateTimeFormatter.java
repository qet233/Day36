package Day19;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test_DateTimeFormatter {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(now));
    }
}
