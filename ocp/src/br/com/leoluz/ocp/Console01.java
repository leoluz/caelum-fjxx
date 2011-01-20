package br.com.leoluz.ocp;

import java.io.Console;

/**
 * class Console01
 * @author Leonardo Luz
 */
public class Console01 {

    public static void main(String args[]) {

        Console console = System.console();
        char[] pw;
        pw = console.readPassword("%s", "pw: ");

        for(char ch: pw)
            console.format("%c", ch);
        console.format("\n");

        MyUtility mu = new MyUtility();

        while(true) {
            String name = console.readLine("%s", "input?: ");
            console.format("output: %s \n", mu.doStuff(name));
        }
    }
}
class MyUtility {
    String doStuff(String arg1) {
        return "result is " + arg1;
    }
}
