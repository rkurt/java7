package examples.default_methods;

public class MultiMobileReportDemo implements Report, MobileReport {

    public static void main(String[] args) {
        MultiMobileReportDemo reportDemo = new MultiMobileReportDemo();
        System.out.println(reportDemo.getName()); // Report for demo: ISA-Mobile
    }

    @Override
    public String getName() {
        return "Report for demo: " + getReportCode();
    }

    @Override
    public String getReportCode() {
        return MobileReport.super.getReportCode();
    }
}
