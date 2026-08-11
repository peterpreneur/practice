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
public class EqualityOfArray {

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 2, 3, 4, 5};
        int array3[] = {5, 4, 3, 2, 1};

        boolean result = Arrays.equals(array1, array2);
        boolean result2 = Arrays.equals(array2, array3);

        System.out.println(result);
        System.out.println(result2);

        //Method 2: using a loop. order needs to be matching
        boolean result3 = true;
        if (array1.length != array2.length) {
            result3 = false;
        } else {
            for (int i = 0; i < 0; i++) {
                if (array1[i] != array2[i]) {
                    result3 = false;
                    break;
                }
            }
        }
    }
}
