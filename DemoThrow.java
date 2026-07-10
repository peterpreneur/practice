package org.peterpreneur;

public class DemoThrow {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("Error 0");
        } catch (ArithmeticException e) {
            System.out.println("Error 1:" + e);

        } catch (Exception e) {
            System.out.println("Error 2:" + e);
        }

        System.out.println("All good");

    }

}
