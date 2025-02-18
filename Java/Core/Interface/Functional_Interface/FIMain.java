package Java.Core.Interface.Functional_Interface;

//FIMain -> Functional Interface Main class
public class FIMain {
    public static void main(String[] args) {
        FunctionalInterfacePractise fip = () -> {
            System.out.println(" >>> Printing from functional interface print method implementation <<< ");
        };

        fip.print();
    }
}
