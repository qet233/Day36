package Day19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test_ChronoUnit {
    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime now2 = LocalDateTime.of(2004, 7, 22, 19, 56);
        System.out.println(ChronoUnit.YEARS.between(now2, now1));
        System.out.println(ChronoUnit.MONTHS.between(now2, now1));
        System.out.println(ChronoUnit.SECONDS.between(now2, now1));
    }
}
