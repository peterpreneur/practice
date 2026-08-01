/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class RunnableDemo {

    // static class Hi implements Runnable {
    //     public void run() {
    //         for (int i = 1; i <= 5; i++) {
    //             System.out.println("Hi " + i);
    //             try {
    //                 Thread.sleep(10);
    //             } catch (InterruptedException e) {
    //                 // TODO Auto-generated catch block
    //                 e.printStackTrace();
    //             }
    //         }
    //     }
    // }
    static class Hello implements Runnable {

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello " + i);
            }
        }
    }

    public static void main(String[] args) {
        Runnable hi = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi " + i);
            }
        };
        Runnable hello = new Hello();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }

}
