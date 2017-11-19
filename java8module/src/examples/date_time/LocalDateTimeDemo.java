package examples.date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        // Data i czas bieżący
        LocalDateTime now = LocalDateTime.now(); // 2017-04-09T13:43:58.579
        LocalDateTime oneHourLater = now.plusHours(1); // 2017-04-09T14:43:58.579
        LocalDateTime twoYearsAgo = now.minusYears(2); // 2015-04-09T13:43:58.579
        LocalDateTime fiveMonthsLater = now.plus(5, ChronoUnit.MONTHS); // 2017-09-09T13:43:58.579

        // Data i czas zdefiniowany
        LocalDateTime definedDateTime = LocalDateTime.of(2017, Month.MARCH, 1, 12, 45, 59); // 2017-03-01T12:45:59
        int hour = definedDateTime.getHour(); // 12
        Month month = definedDateTime.getMonth(); // MARCH
        LocalDateTime newDateTime = definedDateTime.withDayOfYear(1); // 2017-01-01T12:45:59

        // Formatowanie i parsowanie
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM dd, yyyy - HH:mm");
        String formattedDateTime = definedDateTime.format(myFormatter); // 03 01, 2017 - 12:45
        LocalDateTime thatDateTime = LocalDateTime.parse("10 30, 2016 - 05:55", myFormatter); // 2016-10-30T05:55
    }
}
