package com.scjptest;

public class Misc02 {
    private int roomNr;
    
    public Misc02(int roomNr) {
        this.roomNr = roomNr;
    }
    
    public int getRoomNr() {
        return this.roomNr;
    }

    static Misc02 doStuff(Misc02 Misc02) {
        Misc02 = new Misc02(1);
        return Misc02;
    }
    
    public static void main(String args[]) {
        Misc02 h1 = new Misc02(100);
        System.out.print(h1.getRoomNr() + " ");
        Misc02 h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        Runtime.getRuntime().gc();
    }
}