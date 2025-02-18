package Java.Core.Interface;

public class HPLaptop implements Laptop{

    @Override
    public void copy() {
        System.out.println(" >>> HP laptop copy code <<<");
    }

    @Override
    public void cut() {
        System.out.println(" >>> HP laptop cut code <<<");
    }

    @Override
    public void paste() {
        System.out.println(" >>> HP laptop paste code <<< ");
    }

    @Override
    public void capture() {
        System.out.println(" >>> HP laptop camera capture code <<< ");
    }
}
