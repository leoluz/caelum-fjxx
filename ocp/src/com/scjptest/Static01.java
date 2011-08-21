package com.scjptest;

public class Static01 {

    static int i = 1;

    { i = 2; }

    public Static01(){
        Static01.i = 4;
    }

    static { i = 3; }

    static class Static01Inner {
        //Static01.i = 5;
    }

    public static void main (String[] args) {
        //Static01 s = new Static01();
        System.out.println(i);
    }
}
