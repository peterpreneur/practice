/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class ExceptionsTest{

    //Checked Exceptions
    //During compile-time
    //Use try-catch or using throws
    //Unchecked Exceptions
    //At run-time
    //NullPointerException
    //ArithmeticException
    //ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            int result = 100 / num;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Peter");
        }

    }

}
