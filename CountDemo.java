/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

class Counter {

    int count;

    public synchronized void increment() {
        count++;
    }
}

/**
 *
 * @author peter
 */
public class CountDemo {

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        Runnable hi = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };

        Runnable hello = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);

    }

}
