package com.scjptest;

/**
 * class FlowControl03
 * @author Leonardo Luz
 */
public class FlowControl03 {

    /**
     * Testing "for" flow control
     * 
     * @return 
     */
    public boolean forTest() {
        for(int i=0; i<3; i++){
            System.out.println("inside: " + i);
            break;
        }
        return true;
    }

    public static void main (String[] args) {
        FlowControl03 f = new FlowControl03();
        System.out.println(f.forTest());
    }
}
