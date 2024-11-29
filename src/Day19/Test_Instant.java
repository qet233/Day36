package Day19;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test_Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(instant3);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        System.out.println(instant1.isBefore(instant2));
        System.out.println(instant1.isAfter(instant2));

        instant2 = instant2.minusSeconds(1L);
        System.out.println(instant2);

        instant2 = instant2.plusSeconds(1L);
        System.out.println(instant2);
    }
}
