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
public class ReverseString {

    public static void main(String[] args) {
        String s = "welcome";
        String rev = "";
        char c[] = s.toCharArray();

        System.out.println(Arrays.toString(c));

        for (int i = c.length - 1; i >= 0; i--) {
            rev = rev + c[i];
        }

        System.out.println(rev);

        StringBuilder s1 = new StringBuilder(s);
        System.out.println(s1.reverse().toString());

        String rev1 = "";
        for (char c1: c) {
            rev1 = c1 + rev1;
        }
        System.out.println(rev1);
    }

}
