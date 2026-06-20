/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author peter
 */
public class Java1dLambda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Create array using Stream + toArray
        int[] a = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .toArray();

        // Locked code prints the array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        scanner.close();
    }
}
