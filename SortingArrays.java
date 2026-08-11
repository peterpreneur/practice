/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author peter
 */
public class SortingArrays {

    public static void main(String[] args) {
        int numbers[] = {4, 5, 7, 1, 9};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting:" + Arrays.toString(numbers));

        String names [] = {"Zebra", "Bear", "Apple" };

        System.out.println("Before sorting: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sorting:" + Arrays.toString(names));

        Integer num[] = {4, 5, 7, 1, 9};

        System.out.println("Before sorting: " + Arrays.toString(num));
        Arrays.sort(num,  Collections.reverseOrder());
        System.out.println("After sorting:" + Arrays.toString(num));
        System.out.println(num.getClass().getSimpleName());

    }
 
}
