package Day19;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test_ZonedDateTIme {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2004, 7, 22, 18, 53, 13, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = zonedDateTime.withYear(2024);
        ZonedDateTime zonedDateTime3 = zonedDateTime.withMonth(12);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);

        //修改 withxxx 减少 minusxxx 增加 plusxxx


    }
}
