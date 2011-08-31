package com.scjptest;

import java.util.List;
import java.util.ArrayList;

public class Generics {

    public List<Integer> myList = new ArrayList<Integer>();

    public static void main (String[] args) {

        Generics g = new Generics();

        g.myList.add(4);
        g.myList.add(13);
        GenericsTest gt = new GenericsTest();
        gt.insert(g.myList, "Leonardo");

        //without this loop it runs just fine
        //The problem is that generics exists
        //only in compile time. It casts the
        //generic type into the bytecode like
        //the example bellow:
        //
        //System.out.println((Integer) o);
        //
        //So ClassCastException at runtime in
        //this case.
        for (Object o : g.myList) {
            System.out.println(o);
        }
    }
}

class GenericsTest {

    public void insert(List l, String s) {
        l.add(s);
    }

}
