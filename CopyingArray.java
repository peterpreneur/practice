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
public class CopyingArray {

    public static void main(String[] args) {
        int originalArray[] = {1, 2, 3, 4, 5};

        //Method 1: Looping 
        int copiedArray[] = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Original:" + Arrays.toString(originalArray));
        System.out.println("Copied0:" + Arrays.toString(copiedArray));

        //Method 2: CopyOf
        int copiedArray1[] = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied1:" + Arrays.toString(copiedArray1));

        //Method 3: arrayCopy
        int copiedArray2[] = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray2, 0, originalArray.length);
        System.out.println("Copied2:" + Arrays.toString(copiedArray2));

        //Method 4: Clone
        int copiedArray3[] = originalArray.clone();

        System.out.println("Copied3:" + Arrays.toString(copiedArray3));

    }

}
