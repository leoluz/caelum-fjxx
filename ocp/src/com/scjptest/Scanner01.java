package com.scjptest;

import java.util.Scanner;
import java.io.Console;
import java.util.regex.Pattern;

public class Scanner01 {

    private Scanner sc;
    private String in;

    public Scanner01(){
    }

    public void readConsole() {
        Console cons = System.console();
        this.in = cons.readLine();
        this.sc = new Scanner(in);
    }

    public static void main (String[] args) {

        Scanner01 scann = new Scanner01();
        System.out.print("Type anything you want: ");
        scann.readConsole();
        Pattern p = scann.sc.delimiter();

        while (scann.sc.hasNext()) {
            System.out.println(scann.sc.next());
        }
    }
}
