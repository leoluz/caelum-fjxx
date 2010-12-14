/* OCP
 *
 * Copyright 2010 CVC Turismo Ltda, All rights reserved.
 * CVC PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.leoluz.ocp;

import java.util.Stack;

public class CallByValue {
    public static void modifyStacks(Stack<String> one, Stack<Integer> two) {
        two.push(50);
        one.pop();
        one = new Stack<String>();
    }
    
    public static void main(String[] args) {
        Stack<String> names = new Stack<String>();
        names.push("Leo");
        names.push("Luz");
        names.push("Almeida");
        
        Stack<Integer> numbers = new Stack<Integer>();
        numbers.push(10);
        numbers.push(20);
        
        modifyStacks(names, numbers);
        
        System.out.println(names.pop());
        
        for (String name : names) {
            System.out.println(name);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
    }

}
