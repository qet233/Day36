package Day19;

import java.time.ZoneId;
import java.util.Set;

public class Test_ZoneId {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneId zoneId1 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneIds);
        System.out.println(zoneId);
        System.out.println(zoneId1);
    }
}
