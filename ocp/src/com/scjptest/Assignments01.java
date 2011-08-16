package com.scjptest;

public class Assignments01 {

    int i;
    Integer I;

    double d;
    Double D;

    long l;
    Long L;

    public void addi(int x) {
        i += x;
    }
    public void addi(int... x) {
        for (int a : x) {
            i += a;
        }
    }

    public static void main (String[] args) {
        Assignments01 a = new Assignments01();
        a.i = new Integer(1) + new Integer(4);
        a.addi(5);
        a.d = 4.0;
        a.l = (long)a.d;

        System.out.println("i = " + a.i);
        System.out.println("I = " + a.I);
        System.out.println("d = " + a.d);
        System.out.println("D = " + a.D);
        System.out.println("l = " + a.l);
        System.out.println("L = " + a.L);
    }


}
