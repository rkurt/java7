package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "", "Wioletta", null, "Maria");
        List<String> filtered =
                names.parallelStream()
                        .filter(s -> s != null && !s.isEmpty())
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(filtered); // [Jan, Maria, Wioletta]
    }
}

