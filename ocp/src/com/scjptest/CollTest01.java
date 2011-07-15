package com.scjptest;

import java.util.HashSet;
import java.util.Set;

public class CollTest01 {

    public static void main (String[] args) {
        Set<Human> humans = new HashSet<Human>();
        humans.add(new Human(13));
        humans.add(new Human(33));
        humans.add(new Human(21));
        humans.add(new Human(21));
        System.out.println(humans.size()+" ");
        System.out.println(humans);
    }
}

class Human implements Comparable<Human> {

    Integer age;

    public Human(int age) {
        this.age = age;
    }
    public int compareTo(Human h) {
        return h.age.compareTo(this.age);
    }
    public String toString() {
        return ""+this.age;
    }
}
