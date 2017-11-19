package examples.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 2017-04-09

        LocalDate previousSaturday = now.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(previousSaturday); // 2017-04-08

        LocalDate firstFriday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        System.out.println(firstFriday); // 2017-04-07

        LocalDate secondFriday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY))
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(secondFriday); // 2017-04-14
    }
}
