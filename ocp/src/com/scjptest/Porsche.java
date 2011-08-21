package com.scjptest;

public class Porsche extends Car {

    public Porsche() {
        
    }

    public String getModel() {
        return "This is a Porsche!";
    }

    public void speedUp() {
        System.out.println("Speeding a Porsche!");
    
    } 

    public boolean isFullThrottle() {
        return false;
    }
}
