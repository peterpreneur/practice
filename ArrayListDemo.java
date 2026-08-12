/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

class Student {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

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

        Student stu1 = new Student(010, "Peter", 50);
        Student stu2 = new Student(011, "Sunny", 49);
        Student stu3 = new Student(012, "Gisele", 17);

        ArrayList<Student> myStudent = new ArrayList<>();
        myStudent.add(stu1);
        myStudent.add(stu2);
        myStudent.add(stu3);

        Iterator itr = myStudent.iterator();

        while (itr.hasNext()) {
            System.out.println(itr);
        }
    }
}
