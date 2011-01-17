/* OCP
 *
 * Copyright 2011 CVC Turismo Ltda, All rights reserved.
 * CVC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.scjptest;

public class Tests01 { 
    private static void doStuff(String str) {
        int var = 4;
        if (var == str.length()) {
            System.out.print(str.charAt(--var) + " ");
        }
        else {
            System.out.print(str.charAt(0) + " ");
        }
    }
    public static void main(String args[]) {
        doStuff("abcd");
        doStuff("efg");
        doStuff("hi");
    }
}