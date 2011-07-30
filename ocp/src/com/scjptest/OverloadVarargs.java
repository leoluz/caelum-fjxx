package com.scjptest;

public class OverloadVarargs {

    public static void aMeth(Integer... i) {
        System.out.println(1);
    }

    public static void aMeth(int... i) {
        System.out.println(2);
    }

    public static void main (String[] args) {

        //Compile error!
        // reference to aMeth is ambiguous, both methods match
        aMeth(1, 2);
    }
}
