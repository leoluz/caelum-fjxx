package com.scjptest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {

    public static void main (String[] args) {
        
        String regex = "\\.*ing";
        Pattern pattern = Pattern.compile(regex);
        String[] words = {"ing", ".ing", "ding", "during class", "happeningg", "beings"};

        for (String word: words) {

            Matcher matcher = pattern.matcher(word);

            if (matcher.matches()) {
                System.out.println(word + " matches " + regex);
            }
        }
    }                           
}
