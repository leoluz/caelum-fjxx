package com.scjptest;

public class Assertions {

    public static void main (String[] args) {

        Integer i = 3;
        switch (i) {
            case 1 : System.out.println(1); break;
            case 2 : System.out.println(2); break;
            default : assert false : "Shouldn't get in here!";
        
        }
        assert (returnNull() == null) : "It should be null";
    }

    public static String returnNull() {
        return "Ok";
    }
}
