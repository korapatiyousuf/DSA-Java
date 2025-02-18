package Java.Class.AbstractClass;

public class XYZCompany extends SoftwareCompany{
    @Override
    void developer() {
        System.out.println("Develops code for company's software");
    }

    @Override
    void manager() {
        System.out.println("Manages developers and company's work");
    }
}
