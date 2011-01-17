/* OCP
 *
 * Copyright 2011 CVC Turismo Ltda, All rights reserved.
 * CVC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.scjptest;
import java.util.HashSet;

public class HashTest02 {
    
    private String str;
    
    public HashTest02(String str) {
        this.str = str;
    }
        
    @Override
    public int hashCode() {       
        System.out.println("hashCode method");
        return this.str.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) { 
        System.out.println("equals method");
        return this.str.equals(obj);
    }
    
    public static void main(String args[]) {
        HashTest02 h1 = new HashTest02("1");
        HashTest02 h2 = new HashTest02("1");
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