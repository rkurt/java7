package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 5);
        List<Integer> mapped =
                numbers.stream()
                        .map(i -> 2 * i)
                        .collect(Collectors.toList());
        System.out.println(mapped); // [16, 6, 10]
    }
}
