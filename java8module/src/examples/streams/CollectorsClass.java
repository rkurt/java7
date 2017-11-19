package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsClass {
    public static void main(String[] args) {
        String[] names1 = {"Wioletta", "Maria"};
        Stream<String> stream = Stream.of(names1);
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list); // [Wioletta, Maria]

        List<String> names2 = Arrays.asList("Jan", "Tomasz");
        String str = names2.stream().collect(Collectors.joining("; "));
        System.out.println(str); // Jan; Tomasz
    }
}
