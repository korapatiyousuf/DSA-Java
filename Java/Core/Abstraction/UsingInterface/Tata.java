package Java.Core.Abstraction.UsingInterface;

public class Tata implements Vehicle {

    int currSpeed = 0;

    @Override
    public void brake() {
        if(currSpeed > 0) {
            currSpeed -= 10;
        }
        System.out.println("Applying brakes to vehicle");
    }

    @Override
    public void speed() {
        System.out.println("Current speed of tata vehicle is: " +currSpeed);
    }

    @Override
    public void accelerate() {
        if(currSpeed < 100) {
            currSpeed+=20;
        }
        System.out.println("Applying accelerator to vehicle");
    }
}
