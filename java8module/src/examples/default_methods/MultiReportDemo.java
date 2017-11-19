package examples.default_methods;

public class MultiReportDemo implements Report, MobileReport {

    public static void main(String[] args) {
        MultiReportDemo reportDemo = new MultiReportDemo();
        System.out.println(reportDemo.getName()); // Report for demo: ISA-Multi
    }

    @Override
    public String getName() {
        return "Report for demo: " + getReportCode();
    }

    @Override
    public String getReportCode() {
        return "ISA-Multi";
    }
}
