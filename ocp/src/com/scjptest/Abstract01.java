package com.scjptest;

public abstract class Abstract01 {

    public abstract void start() throws ArithmeticException;

    public static void main (String[] args) {

        Abstract01 a = new Abstract01() {
            public void start() throws ArithmeticException {
                System.out.println(1);
                try {
                    System.out.println(2);
                    throw new ArithmeticException();

                    //Compile error: unreachable statement!!
                    System.out.println(3);

                } catch (Exception e) {
                    System.out.println(4);
                } finally {
                    System.out.println(5);
                }
            }
        };

        a.start();
    }
}
