package com.scjptest;

public class DownCast {

    public static void main (String[] args) {

        Honda h = new Honda();
        Civic c = (Civic) h; //throws ClassCastException at runtime
        
        System.out.println("Is automatic: " + c.isAutomatic());
    }

}
