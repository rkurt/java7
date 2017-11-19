package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Wioletta", "Maria");
        List<String> filtered =
                names.stream()
                        .limit(2)
                        .collect(Collectors.toList());
        System.out.println(filtered); // [Jan, Wioletta]
    }
}

