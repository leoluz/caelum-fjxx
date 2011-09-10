package com.scjptest;

public class Autoboxing {

    public static void main (String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 1000;
        Integer i4 = 1000;

        String firstComparison = (i1 == i2) ? "i1 == i2" : "i1 != i2";  //are the same object
        String secondComparison = (i3 == i4) ? "i3 == i4" : "i3 != i4"; //aren't the same object

        System.out.println(firstComparison+"\n"+secondComparison);
    }
}
