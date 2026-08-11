/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class SearchArray {

    public static void main(String[] args) {
        int numbers[] = {5, 10, 5, 7, 3, 2};

        int searchElement = 5;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                System.out.println("Element found at:" + i);
                break;
            }
        }
    }

}
