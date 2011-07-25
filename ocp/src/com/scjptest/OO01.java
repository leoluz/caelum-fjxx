package com.scjptest;

public class OO01 {
}

class Vehicle {
    public void printSound() {
        System.out.println("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.println("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.println("bike");
    }
}

class Test {
    public static void main (String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v;

        v.printSound();
        b.printSound();
    }
}
