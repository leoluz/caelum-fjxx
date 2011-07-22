package com.scjptest;

class MyFerrari extends Ferrari {

    public boolean isAutomatic() {
        return true;
    }

    public static void main (String[] args) {
        MyFerrari f = new MyFerrari();
        System.out.println(f instanceof Car);
    }

}
