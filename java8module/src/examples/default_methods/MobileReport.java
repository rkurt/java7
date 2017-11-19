package examples.default_methods;

public interface MobileReport {
    String getName();

    default String getReportCode() {
        return "ISA-Mobile";
    }
}

