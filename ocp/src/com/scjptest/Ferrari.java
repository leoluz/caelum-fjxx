package com.scjptest;

class Ferrari implements Car {

    public String getModel() {
        return "Ferrari";
    }
    public boolean isAutomatic() {
        return false;
    }
    public static void main (String[] args) {

        Ferrari f = new Ferrari();
        
        System.out.println(f instanceof Car);
    }

}
