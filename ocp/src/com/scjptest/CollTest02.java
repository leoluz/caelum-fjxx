package com.scjptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollTest02 {
    public static void main (String[] args) {
        List<Foo> myFooList = new ArrayList<Foo>();
        myFooList.add(new Foo("C"));
        myFooList.add(new Foo("A"));
        myFooList.add(new Foo("D"));

        Collections.sort(myFooList);
        System.out.println(myFooList.get(0).code);
        System.out.println(null + "" + null);
    }
}

class Foo implements Comparable<Foo> {
    String code;

    Foo(String c) {
        code = c;
    }

    public int compareTo(Foo f) {
        return this.code.compareTo(f.code);
    }
}
