package br.com.leoluz.ocp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer03 {
    
    public static void main(String[] args) {
        try {
            File file = new File("bin/writer03.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("Writing in a file");
            pw.println("Using PrintWriter");
            
            fw.flush();
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
