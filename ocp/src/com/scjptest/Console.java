package com.scjptest;

public class Console {

    public static void main (String[] args) {

        byte b = 127;                                                 //8 bits –128 to 127
        short s = 32767;                                              //16 bits –32768 to 32767
        char c = 65535;                                               //16 bits '\u0000' to '\uffff' (0 to 65535)
        int i = 2147483647;                                           //32 bits –2147483648 to 2147483647
        long l = 9223372036854775807l;                                //64 bits –9223372036854775808 to 9223372036854775807
        float f = (2-(float)Math.pow(2, -23))*(float)Math.pow(2,127); //32 bits 2–149 to (2 – 2–23) · 2127
        double d = (2-Math.pow(2, -52))*Math.pow(2,1023);             //64 bits 2–1074 to (2 – 2–52) · 21023
        boolean boo = true;
        Boolean boo2 = null;

        java.io.Console console = System.console();
        console.format("Java primitive types max values:%n");
        console.format("byte: %d%n", b);
        //format() and printf() are 2 identical methods with different names (??)
        console.printf("short: %d%n", s);
        console.printf("char: %c%n", c);
        console.printf("int: %d%n", i);
        console.printf("long: %d%n", l);
        console.printf("float: %f%n", f);
        console.printf("double: %f%n", d);
        console.printf("boolean: %b, %b%n", boo, boo2);
    }
}
