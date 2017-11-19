package examples.streams;

import java.util.Arrays;
import java.util.List;

public class MatchDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Wioletta", "Maria");

        boolean allMatched =
                names.stream()
                        .allMatch(s -> s.contains("i"));
        System.out.println(allMatched); //false

        boolean anyMatched =
                names.stream()
                        .anyMatch(s -> s.contains("i"));
        System.out.println(anyMatched); //true
    }
}

