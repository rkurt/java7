package examples.functional_interfaces;

import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {
        Comparator<String> indexComparator = (s1, s2) -> s1.indexOf(s2);
        Comparator<String> indexReverseComparator = indexComparator.reversed();

        String string1 = "abcd";
        String string2 = "bc";

        indexComparator.compare(string1, string2); // 1
        indexReverseComparator.compare(string1, string2); // -1
    }
}
