package examples.date_time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.plus(60, ChronoUnit.SECONDS)); // + 60 sekund
        System.out.println(now.minus(12, ChronoUnit.MONTHS)); // - 12 miesięcy
        System.out.println(now.plus(2, ChronoUnit.DECADES)); // + 20 lat
        System.out.println(now.plus(1, ChronoUnit.CENTURIES)); // + 100 lat
    }
}
