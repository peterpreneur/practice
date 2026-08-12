/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.Iterator;
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
        myList.add(2, "no two");
        myList.removeFirst();

        myList.set(0, "_");

        for (Object myListUnit : myList) {
            System.out.println(myListUnit);
            System.out.println(myList.get(0));
        }

        System.out.println(myList.toString());
        System.out.println(myList.size());

        Iterator<Object> iterate = myList.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        ArrayList<Object> myList7 = new ArrayList<>();
        myList7.add(10);

        myList.removeAll(myList7); 
        System.out.println(myList);
        
        
    }
}
