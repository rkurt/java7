package examples.functional_interfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> mailFotterPrinter = (s) -> System.out.println("Pozdrawiam, " + s);
        mailFotterPrinter.accept("Joanna"); // Pozdrawiam, Joanna
    }
}
