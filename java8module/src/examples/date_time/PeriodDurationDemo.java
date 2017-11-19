package examples.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationDemo {

    public static void main(String args[]) {
        LocalDate today = LocalDate.now(); // 2017-04-09
        Period period1 = Period.of(1, 1, 1);
        System.out.println(today.plus(period1)); // 2018-05-10

        LocalDate newDate = today.plusYears(5); // 2022-04-09
        Period period2 = Period.between(today, newDate);
        System.out.println(period2.getYears()); // 5 lat

        LocalTime now = LocalTime.now(); // 12:45
        Duration duration1 = Duration.of(10, ChronoUnit.MINUTES);
        System.out.println(now.plus(duration1)); // 12:55

        LocalTime newTime = now.plusHours(2); // 14:45
        Duration duration2 = Duration.between(now, newTime);
        System.out.println(duration2.getSeconds()); // 7200 sekund
    }
}
