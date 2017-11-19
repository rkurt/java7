package examples.tester;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tomasz");
        names.add("Wioletta");
        names.add("Anna");

        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(names);
    }
}
