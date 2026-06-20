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
public class Java2dArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the 2D array (6x6)
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        
        // Find and print the maximum hourglass sum
        System.out.println(hourglassSum(arr));
        
        scanner.close();
    }
    
    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        
        // Loop through all valid top-left positions for hourglasses
        // In a 6x6 array, valid positions are 0 to 3 (rows and columns)
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Calculate hourglass sum for current position
                
                // Top row: arr[i][j], arr[i][j+1], arr[i][j+2]
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                
                // Middle: arr[i+1][j+1]
                int middle = arr[i + 1][j + 1];
                
                // Bottom row: arr[i+2][j], arr[i+2][j+1], arr[i+2][j+2]
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                
                // Total hourglass sum
                int hourglassSum = top + middle + bottom;
                
                // Update maxSum if current sum is larger
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }
        
        return maxSum;
    }
}
