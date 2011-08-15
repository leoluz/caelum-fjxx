package com.scjptest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {

    public static void main (String[] args) {

        String re = "e\\w\\w";
        Pattern pattern = Pattern.compile(re);

        String name = "leonardo Luz Almeida";
        Matcher matcher = pattern.matcher(name);

        System.out.println("string: " + name);

        //find() searches for an occurrence of the patten
        while (matcher.find()) {
            System.out.println("start: " + matcher.start() + " end: " + matcher.end() + " group: " + matcher.group());
        }

        //matches() searches an entire region for the pattern
        if (matcher.matches()) {
            System.out.println(name + " matches " + re);
        } else {
            System.out.println(name + " DOESN'T match " + re);
        }
    }
}
