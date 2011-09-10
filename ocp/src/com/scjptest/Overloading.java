package com.scjptest;

public class Overloading {

    public void aMethod(Object o) {
        System.out.println("Object");
    }
    public void aMethod(Float f) {
        System.out.println("Float");
    }
    public void aMethod(Integer i) {
        System.out.println("Integer");
    }

    public static void main (String[] args) {
        Overloading over = new Overloading();
        over.aMethod(5.13);
        over.aMethod(18);
        over.aMethod("Leo");
    }
}
