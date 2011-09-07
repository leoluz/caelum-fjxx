package com.scjptest;

public class InnerClasses01 {

    private class MyInner {

        boolean b;

        private Boolean getMyInnerBoolean() {
            return b;
        }
    }

    public MyInner getMyInnerInstance() {
        return new MyInner();
    }

    public Boolean getBoolean() {
        return getMyInnerInstance().getMyInnerBoolean();
    }
}

class TestInnerClasses {
    public static void main (String[] args) {
        InnerClasses01 i = new InnerClasses01();
        System.out.println(i.getBoolean());
    }
}
