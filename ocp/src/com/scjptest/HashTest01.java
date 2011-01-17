package com.scjptest;

import java.util.HashSet;

public class HashTest01 {
    
    private String str;
    
    public HashTest01(String str) {
        this.str = str;
    }
    
    public static void main(String args[]) {
        HashTest01 h1 = new HashTest01("1");
        HashTest01 h2 = new HashTest01("1");
        String s1 = new String("2");
        String s2 = new String("2");
        
        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
        hs.add(s1);
        hs.add(s2);
        
        System.out.print(hs.size());
    }
}