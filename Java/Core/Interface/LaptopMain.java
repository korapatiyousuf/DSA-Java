package Java.Core.Interface;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop hp = new HPLaptop();
        Laptop.operatingSystem();
        hp.processor();
        hp.copy();
        hp.cut();
        hp.paste();
        hp.capture();



    }
}
