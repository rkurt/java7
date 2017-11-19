package examples.streams;

import java.util.Arrays;
import java.util.List;

public class CountDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Wioletta", "Maria");
        long count =
                names.stream()
                        .filter(s -> s.contains("i"))
                        .count();
        System.out.println(count); // 2
    }
}

