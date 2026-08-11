/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class StringBufferAndBuilder {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("Hello");
        s.append(" world");

        System.out.println(s);

        s.insert(5, " test ");
        System.out.println(s);

        s.replace(5, 6, "6");
        System.out.println(s);

        s.delete(5, 7);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        StringBuilder t = new StringBuilder("Hello");
        t.append(" world");
        System.out.println(t);

        //StringBuffer - doesn't work on threading concept
        //StringBuilder - handle thread concept

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original value " + sb);
        sb.append("world ")


    }

}
