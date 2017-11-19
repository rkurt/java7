package examples.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 5);
        IntSummaryStatistics stats =
                numbers.stream()
                        .mapToInt(x -> 2 * x)
                        .summaryStatistics();

        System.out.println(stats.getMax()); // 16
        System.out.println(stats.getMin()); // 6
        System.out.println(stats.getSum()); // 32
        System.out.println(stats.getAverage()); // 10.66666666
    }
}
