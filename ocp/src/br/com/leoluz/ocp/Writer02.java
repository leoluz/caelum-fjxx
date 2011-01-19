package br.com.leoluz.ocp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer02 {

    public static void main(String [] args) {
        char[] in = new char[50]; // to store input
        int size = 0;

        try {
            File file = new File("fileWrite2.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("howdy\nfolks\n");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            size = fr.read(in);
            System.out.print("size: " + size + "\n");
            for(char c : in) System.out.print(c);
            fr.close();
        } 
        catch(IOException e) { 
            System.out.println("Error: " + e.getMessage());
        }
    }
}
