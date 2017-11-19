package examples.default_methods;

public class ReportDemo implements Report {

    public static void main(String[] args) {
        ReportDemo reportDemo = new ReportDemo();
        System.out.println(reportDemo.getName()); // Report for demo: ISA
        Report.generateReportFile(); // Raport został wygenerowany!
    }

    @Override
    public String getName() {
        return "Report for demo: " + getReportCode();
    }
}
