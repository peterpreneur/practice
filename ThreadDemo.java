/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class ThreadDemo {

    static class Hi extends Thread {

        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    static class Hello extends Thread {

        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        }
    }

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        // hi.setPriority(Thread.MAX_PRIORITY);
        // hello.setPriority(Thread.MIN_PRIORITY);
        System.out.println(hi.getPriority()
        );
        System.out.println(hello.getPriority()
        );

        hi.start();
        hello.start();

    }

}
