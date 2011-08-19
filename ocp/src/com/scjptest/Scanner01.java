package com.scjptest;

import java.util.Scanner;
import java.io.Console;
import java.util.regex.Pattern;

public class Scanner01 {

    private String in;
    private Scanner sc;

    public Scanner01(){
    }

    public void readConsole() {
        Console cons = System.console();
        this.in = cons.readLine();
        this.sc = new Scanner(this.in);
    }

    public static void main (String[] args) {

        System.out.print("Type anything you want: ");

        Scanner01 scann = new Scanner01();
        scann.readConsole();

        String regex = "\\c";
        Pattern p = Pattern.compile(regex);
        scann.sc.useDelimiter(p);

        while (scann.sc.hasNext()) {
            System.out.println(scann.sc.next());
        }
    }
}
