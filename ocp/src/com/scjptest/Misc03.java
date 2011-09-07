package com.scjptest;

public class Misc03 {

    public static void main (String[] args) {
        boolean b1=false;
        boolean b2=true;

        Boolean b3=true;
        
        if (b3.equals(b2))
            System.out.println("equals");

        Object ob= (b2=false)?((b1=true)?"A":(b1=false)?"B":9800L):((b1=false)?"C":(b2==false)?"D":new java.util.Date());
        System.out.println(ob);

    }
}
