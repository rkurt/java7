package examples.date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

    public static void main(String[] args) {
        // Data bieżąca
        LocalDate today = LocalDate.now(); // 2017-04-09
        LocalDate tomorrow = today.plusDays(1); // 2017-04-10
        LocalDate twoYearsAgo = today.minusYears(2); // 2015-04-09
        LocalDate threeMothsLater = today.plus(3, ChronoUnit.MONTHS); // 2017-07-09

        // Data zdefiniowana
        LocalDate definedDate = LocalDate.of(2017, Month.MARCH, 1); // 2017-03-01
        Month month = definedDate.getMonth(); // MARCH
        int year = definedDate.getYear(); // 2017
        LocalDate newDate = definedDate.withDayOfYear(1); // 2017-01-01

        // Formatowanie i parsowanie
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String formattedDate = definedDate.format(shortFormatter); // 01.03.17
        LocalDate thatDate = LocalDate.parse("24.12.17", shortFormatter); // 2017-12-24
    }
}
