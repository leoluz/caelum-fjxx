package com.scjptest;

public class ThreadTest01 implements Runnable {

    public void run() {
        System.out.println("start run(): " + Thread.currentThread().getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end run(): " + Thread.currentThread().getState());
    }
    public static void main (String[] args) {

        ThreadTest01 tt = new ThreadTest01();
        Thread t = new Thread(tt);

        System.out.println("start main() "+t.getState());
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end main(): "+t.getState());
    }
}
