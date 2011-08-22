package com.scjptest;

class Honda {

    public void speedUp() {
        System.out.println("Speeding a Honda!");
    }

    public boolean isFullThrottle() {
        return false;
    }
}

//Recognizes super class methods implementation 
//even if super class doesn't implements Driveable
public class Civic extends Honda implements Driveable {

    public static void main (String[] args) {
        Honda car = new Civic();
        car.speedUp();
    }

}
