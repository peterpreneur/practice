package org.peterpreneur;

import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = Integer.parseInt(input.nextLine());

            while (t-- > 0) {
                int n = Integer.parseInt(input.nextLine());
                int result = (int) Handshake.handshake(n);
                System.out.println(result);
            }
        }
    }

    public static long handshake(int n) {
        if (n <= 0 || n >= 1_000_000) {
            return 0;
        }
        return (long) n * (n - 1) / 2;
    }

}
