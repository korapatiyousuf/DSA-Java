package Java.Thread;

import java.lang.Runnable;

public class RunnablePractise implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from \" RunnablePractise \" user class run method ->>>> " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnablePractise r1 = new RunnablePractise();
        Thread t1 = new Thread(r1, "Runnable Impl");
        t1.start();
        System.out.println(t1.getName());
    }
}
