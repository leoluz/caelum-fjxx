package com.scjptest;

public class Tricky {

     int i=1;

     public int getI(){
          System.out.print("Super");
          return i;
     }

     public static void main(String arhs[]){
         Tricky tricky = new TrickyOne();
         System.out.println(tricky.i + " " + tricky.getI());
     }
}

class TrickyOne extends Tricky{

     int i=2;

     public int getI(){
          System.out.print("Sub");
          return i;
     }

}
