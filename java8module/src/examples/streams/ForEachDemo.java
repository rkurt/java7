package examples.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Wioletta", "Maria");
        names.forEach(s -> {
            String dots = "...";
            System.out.println(s.concat(dots));
        });
        // Jan...
        // Wioletta...
        // Maria...
    }
}

