/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.Arrays;

/**
 *
 * @author peter
 */
public class SearchArray {

    public static void main(String[] args) {

        // linear search
        int numbers[] = {5, 10, 5, 7, 3, 2};

        int searchElement = 15;

        boolean status = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                System.out.println("Element found at:" + i);
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println("Element not found");
        }

        // Binary search (only sorted array)
        int number[] = {10, 20, 30, 40, 50};
        Arrays.sort(number);
        int search = 30;

        int i = Arrays.binarySearch(number, search);
        System.out.println(i);
        if (i>0) {
            System.out.println("Element found at:" + i);
        } else {
            System.out.println("Element not found");
        }

    }

}
