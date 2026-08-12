/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author peter
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();

        List<Object> myList1 = new ArrayList<>();

        List<Integer> mylist2 = new ArrayList<>();

        myList.add("1");
        myList.add(10.5);
        myList.add(10);

        for (Object myListUnit : myList) {
            System.out.println(myListUnit);

        }
    }
}
