package examples.default_methods;

public interface Report {
    static void generateReportFile() {
        System.out.println("Raport został wygenerowany!");
    }

    String getName();

    default String getReportCode() {
        return "ISA";
    }
}

