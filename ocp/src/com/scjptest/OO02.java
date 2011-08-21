package com.scjptest;

import java.io.IOException;

public class OO02 {

    public static void main (String[] args) {

        Ferrari ferrari = new Ferrari();
        Car porsche = new Porsche();

        try {
            porsche.speedUp();
            ferrari.speedUp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
