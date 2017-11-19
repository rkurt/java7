package examples.date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ClockDemo {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis(); // 1491734943778

        ZoneId zone1 = clock.getZone(); // Europe/Warsaw
        ZoneId zone2 = ZoneId.of("Europe/Warsaw"); // Europe/Warsaw

        Instant instant = clock.instant();
        ZoneOffset zoneOffset = zone1.getRules().getStandardOffset(instant);
        System.out.println(zoneOffset); // +01:00

        System.out.println(ZoneId.getAvailableZoneIds()); // zwraca wszystkie strefy czasowe
    }
}
