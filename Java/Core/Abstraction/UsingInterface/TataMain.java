package Java.Core.Abstraction.UsingInterface;

public class TataMain {
    public static void main(String[] args) {
        Vehicle tata = new Tata();
        tata.speed();
        tata.accelerate();
        tata.accelerate();
        tata.accelerate();
        tata.speed();
        tata.brake();
        tata.speed();
    }
}
