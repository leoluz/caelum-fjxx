package com.scjptest;

/**
 * class FlowControl02
 * @author Leonardo Luz
 */
public class FlowControl02 {

    public static void main (String[] args) {

        int i = 11;

        switch (i) {
            case 1: System.out.println("1");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 10: System.out.println("10");
        }
    }
}
