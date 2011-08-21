package com.scjptest;

import java.io.IOException;

class Ferrari extends Car {

    public String getModel() {
        return "This is a Ferrari!";
    }

    public boolean isAutomatic() {
        return false;
    }

    public void speedUp() throws IOException {
        System.out.println("Speeding a Ferrari!");
        throw new IOException("Engine malfunctioning!");
    }

    public boolean isFullThrottle() {
        return false;
    }

    public static void main (String[] args) {
        Ferrari f = new Ferrari();
        System.out.println(f instanceof Car);
    }
}
