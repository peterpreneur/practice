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
public class StringMethods {

    public static void main(String[] args) {
        String str = "Welcome";

        char ch = str.charAt(3);
        System.out.println(ch);

        String word = str.substring(3);
        System.out.println(word);

        String word1 = str.substring(3, 5);
        System.out.println(word1);

        boolean flag = str.contains("wel");
        System.out.println(flag);

        boolean flag1 = str.equalsIgnoreCase("WEL");
        System.out.println(flag1);

        String replaceStr = str.replace("come", "meet");
        System.out.println(replaceStr);

        String str1 = "Hello world";
        String words[] = str1.split(" ");
        for (String word11 : words) {
            System.out.println(word11);

            String str2 = "abc@gmail.com, def";
            String a[] = str2.split(",");
            System.out.println(a[0]);
            System.out.println(a[1].trim());
            String b[] = a[0].split("@");
            System.out.println(b[0]);
        }

        String str2 = "welcome";
        System.out.println(str2.indexOf("om"));

        System.out.println(str2.startsWith("wel"));

        String str3 = "";
        System.out.println(str3.length());
        System.out.println(str3.isEmpty());

        char charTest[] = str2.toCharArray();
        for (char a: charTest) {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(charTest));

        int n = 123;
        String string1 = String.valueOf(n);
        System.out.println(string1);

        // == compare object references
        // equals() compare values of object

        String s1 = "welcome"; // in string pool
        String s2 = new String("welcome"); //hash 
        System.out.println(s2);  

    }

}
