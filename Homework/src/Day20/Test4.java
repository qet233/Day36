package Day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //jdk7
        String birthday ="2004-7-22";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);
        long l = System.currentTimeMillis() - birthdayDate.getTime();
        System.out.println("活了"+l/1000/60/60/24+"天");
        //jdk8
        LocalDate birthdayLocalDate =LocalDate.of(2004,7,22);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(birthdayLocalDate, now));
    }
}
