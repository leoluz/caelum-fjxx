package com.scjptest;

/**
 * class FlowControl01
 * @author Leonardo Luz
 */
public class FlowControl01 {

    public static void main (String[] args) {
        if (true)
            if (false)
                System.out.println("if false");
            else if (true)
                System.out.println("esle if");
            else
                System.out.println("else");
        else
            System.out.println("final else");

        System.out.println("out");

    }
}
