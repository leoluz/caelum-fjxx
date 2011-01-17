package com.scjptest;

public class Misc01 {
    public static void main(String[] args) {
        String test = "This is a test string";
        String[] tokens = test.split("\\s");
        System.out.println(tokens.length);  
        System.out.printf("Pi = %f and E = %b", Math.PI, Math.E);
    }
}
