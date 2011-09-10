package com.scjptest;

public class Misc01 {

    public static void main(String[] args) {
        String test = "This is a test string";
        String[] tokens = test.split("\\s");
        System.out.println(tokens.length);  
        System.out.println("XOR: " + ((2>3) ^ (4<5)));
        System.out.printf("Pi = %f and E = %b", Math.PI, Math.E);

        String str = "aaaaaaaaabb";
        String[] ss = str.split("a{3}");

        for (String s : ss) {
            System.out.println(s);
        }
        System.out.println(ss.length);
    }
}
