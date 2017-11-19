package examples.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Java7Tester {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tomasz");
        names.add("Wioletta");
        names.add("Anna");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names);
    }
}
