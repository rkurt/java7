package examples.functional_interfaces;

public class ConverterDemo {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (String from) -> Integer.valueOf(from);
        Integer converted = converter.convert("1000");
        System.out.println(converted); // 1000
    }
}
