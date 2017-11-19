package excercises.date_time;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public interface MathResults {

    static void printMax(Integer s) {
        System.out.println("Wynik działania metody max = " + s);
    }

    static void printMin(Integer s) {
        System.out.println("Wynik działania metody min = " + s);
    }

    static void printStartTime(ZonedDateTime zonedDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        String formatted = zonedDateTime.format(dateTimeFormatter);
        System.out.println("Data uruchomienia operacji = " + formatted);
    }

    static void printDuration(Duration duration) {
        System.out.println("Czas wykonania operacji (sekund) = " + duration.getSeconds());
    }

    default List<Integer> getIntegersForDemo() {
        return null;
    }
}
