package examples.date_time;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeDemo {

    public static void main(String args[]) {
        // Data i czas bieżący
        ZoneId myZone = ZoneId.systemDefault(); // Europe/Warsaw
        ZonedDateTime now = ZonedDateTime.now(myZone); // 2017-04-09T13:23:48.613+02:00[Europe/Warsaw]
        ZonedDateTime oneHourLater = now.plusHours(1); // 2017-04-09T14:23:48.613+02:00[Europe/Warsaw]
        ZonedDateTime twoYearsAgo = now.minusYears(2); // 2015-04-09T13:23:48.613+02:00[Europe/Warsaw]
        ZonedDateTime fiveMonthsLater = now.plus(5, ChronoUnit.MONTHS); // 2017-09-09T13:23:48.613+02:00[Europe/Warsaw]

        // Data, czas i strefa zdefiniowana
        ZoneId otherZone = ZoneId.of("America/El_Salvador"); // America/El_Salvador
        ZonedDateTime definedDateTime = ZonedDateTime.of(2017, 3, 1, 12, 45, 59, 0, otherZone); // 2017-03-01T12:45:59-06:00[America/El_Salvador]
        int hour = definedDateTime.getHour(); //12
        Month month = definedDateTime.getMonth(); // MARCH
        ZonedDateTime newDateTime = definedDateTime.withDayOfYear(1); // 2017-01-01T12:45:59-06:00[America/El_Salvador]

        // Formatowanie i parsowanie
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formattedDateTime = definedDateTime.format(mediumFormatter); // 2017-03-01 12:45:59
        ZonedDateTime thatDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]"); // 2007-12-03T10:15:30+05:00[Asia/Karachi]
    }
}
