package Java.Core.Interface;

public interface Laptop {

    abstract void copy();

    void cut();

    void paste();

    void capture();

    default void processor() {
        System.out.println(" >>> Intel CPU processor installation started <<< ");
    }

    static void operatingSystem() {
        System.out.println(" >>> Windows installation started... <<< ");
    }
}
