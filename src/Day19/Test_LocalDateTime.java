package Day19;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test_LocalDateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(now.getMonth());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println("================================");

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

    }
}
