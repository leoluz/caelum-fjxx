package com.scjptest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Date {

    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
//        df.setLocale(Locale.US);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2009);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);
        String formattedDate = df.format(c.getTime());
        System.out.println(formattedDate);
    }
    
}
