/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Java1dArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> a = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int[] array = a.stream()
            .mapToInt(Integer::intValue)
            .toArray();

        // Locked code prints the array
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
