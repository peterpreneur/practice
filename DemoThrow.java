package org.peterpreneur;

public class DemoThrow {

    static class PeterException extends RuntimeException {

        public PeterException(String string) {
            super(string);
        }
    }

    public static void main(String[] args) {

        int i = 1;
        int j = 0;
        int s = 0;

        try {
            j = 18 / i;
            if (s == 0) {
                throw new PeterException("Test");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error 1:" + e);

        } catch (PeterException e) {
            System.out.println("Error 3:" + e);
    
        }     
        catch (Exception e) {
            System.out.println("Error 2:" + e);
        }

        System.out.println("All good");

    }

}
