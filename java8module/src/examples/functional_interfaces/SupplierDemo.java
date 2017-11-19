package examples.functional_interfaces;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<SupplierDemo> demoSupplier = SupplierDemo::new;
        SupplierDemo demo = demoSupplier.get(); // new SupplierDemo object
    }
}
