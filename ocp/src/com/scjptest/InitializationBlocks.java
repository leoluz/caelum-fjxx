package com.scjptest;

class InitializationBlocksSuper {

    public InitializationBlocksSuper() {
        System.out.println("Super constructor");
    }

}

public class InitializationBlocks extends InitializationBlocksSuper {

    public InitializationBlocks(){
        System.out.println("InitializationBlocks constructor");
    }

    {
        System.out.println("InitializationBlocks initialization block");
    }

    static {
        System.out.println("Static initialization block");
    }
}

class InitializationBlocksTest {

    public static void main (String[] args) {
        InitializationBlocks ib = new InitializationBlocks();
    }

}
