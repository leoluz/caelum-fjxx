package com.scjptest;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat01 {

    public static void main (String[] args) {
        Float money = 10000.99F;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "bR"));
        System.out.println(nf.format(money)); 
    }

}
