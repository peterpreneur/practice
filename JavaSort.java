package org.peterpreneur;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

    static class Student {

        private final int id;
        private final String name;
        private final double value;

        Student(int id, String name, double value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public double getValue() {
            return this.value;
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        List<Student> students = new ArrayList<>();

        while (num-- > 0) {
            String line = input.nextLine().trim();
            String[] parts = line.split("\\s+");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double value = Double.parseDouble(parts[2]);

            students.add(new Student(id, name, value));
        }

        students.sort(
                Comparator
                        .comparingDouble(Student::getValue).reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getId)
        );

        for (Student s : students) {
            System.out.println(s.getName());
        }

        input.close();
    }
}