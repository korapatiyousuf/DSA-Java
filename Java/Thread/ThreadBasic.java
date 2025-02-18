package Java.Thread;

import java.lang.Thread;

public class ThreadBasic {
    public static void main(String[] args) {
        System.out.println("Thread Practise");
        System.out.println("Thread count: " +Thread.activeCount());
        System.out.println("Thread name: " +Thread.currentThread().getName());
        System.out.println("Thread priority: " +Thread.currentThread().getPriority());

        // ---------------------- User threads ----------------------
    }
}
