package Java.Core.Abstraction.UsingAbstractClass;

public class Boy extends Human{

    @Override
    void eat() {
        System.out.println(" >>> Boy is eating <<<");
    }

    @Override
    void work() {
        System.out.println(" >>> Boy is working <<<");
    }

    @Override
    void sleep() {
        System.out.println(" >>> Boy is sleeping <<<");
    }
}
