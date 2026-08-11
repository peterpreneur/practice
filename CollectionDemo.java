/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author peter
 */
public class CollectionDemo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(4);

        Set<Integer> sets = new TreeSet<Integer>();
        sets.add(6);
        sets.add(6);
        sets.add(5);

        System.out.println("nums");

        for (Object n : nums) {
            // System.out.println(n);

            int num = (Integer) n;
            System.out.println(num);

        }

        System.out.println("sets");

        for (int s : sets) {
            // System.out.println(n);

            System.out.println(s);

        }
    }

}
