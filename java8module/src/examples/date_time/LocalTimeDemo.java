package examples.date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {
        // Czas bieżący
        LocalTime now = LocalTime.now(); // 13:42:07.592
        LocalTime oneHourLater = now.plusHours(1); // 14:42:07.592
        LocalTime tenMinutesAgo = now.minusMinutes(10); // 13:32:07.592
        LocalTime fiveSecondsLater = now.plus(5, ChronoUnit.SECONDS); // 13:42:12.592

        // Czas zdefiniowany
        LocalTime definedTime = LocalTime.of(12, 45, 59); // 12:45:59
        int hour = definedTime.getHour(); // 12
        int seconds = definedTime.getSecond(); // 59
        LocalTime newTime = definedTime.withHour(11); // 11:45:59

        // Formatowanie i parsowanie
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String formattedTime = definedTime.format(shortFormatter); // 12:45
        LocalTime thatTime = LocalTime.parse("05:55", shortFormatter); // 05:55
    }
}
