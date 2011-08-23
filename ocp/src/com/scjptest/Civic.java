package com.scjptest;

//Recognizes super class methods implementation 
//even if super class doesn't implements Driveable
public class Civic extends Honda implements Driveable {

    public boolean isAutomatic() {
        return false;
    }

    public static void main (String[] args) {
        Honda car = new Civic();
        car.speedUp();
    }

}
