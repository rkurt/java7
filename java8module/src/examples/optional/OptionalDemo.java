package examples.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String str1 = "isa";
        Optional<String> optional1 = Optional.of(str1);
        System.out.println(optional1.isPresent()); // true
        System.out.println(optional1.get()); // "isa"
        System.out.println(optional1.orElse("empty")); // "isa"

        String str2 = null;
        Optional<String> optional2 = Optional.ofNullable(str2);
        System.out.println(optional2.isPresent()); // false
        System.out.println(optional2.orElse("empty")); // "empty"
    }
}
