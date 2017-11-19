package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Wioletta", "Maria");
        List<String> filtered =
                names.stream()
                        .filter(s -> s.contains("i"))
                        .collect(Collectors.toList());
        System.out.println(filtered); // [Wioletta, Maria]
    }
}

