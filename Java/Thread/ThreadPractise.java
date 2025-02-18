package Java.Thread;

import java.lang.Thread;

public class ThreadPractise extends Thread {

    public ThreadPractise(String threadName) {
        super(threadName);
    }

    @Override
    public void run(){
        System.out.println("Hello from \" ThreadPractise \" user class run method ->>>> " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadPractise t1 = new ThreadPractise("First Thread");
        t1.start();

        System.out.println("Current thread name: " +currentThread().getName());
    }
}
