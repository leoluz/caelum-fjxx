package br.com.leoluz.ocp;

import java.io.File;
import java.io.IOException;

public class Writer01 {
    public static void main(String [] args) {
        try {
            boolean newFile = false;

            File file = new File("bin/fileWrite1.txt");
            System.out.println(file.exists()); 

            newFile = file.createNewFile(); 
            System.out.println(newFile); // already there?

            System.out.println(file.exists()); // look again
        } 
        catch(IOException e) { }
    }
}
