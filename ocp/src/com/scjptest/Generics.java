package com.scjptest;

import java.util.List;
import java.util.ArrayList;

/**
 * class Generics
 * The idea of this class is to test every aspect of using Generics
 * in your code
 * @author Leonardo Luz
 */
public class Generics {

    private List<Integer> myList = new ArrayList<Integer>();
    private List<Animal> animals = new ArrayList<Animal>();
    private List<Dog> dogs = new ArrayList<Dog>();
    private List<Cat> cats = new ArrayList<Cat>();
    private List<? extends Animal> wildcardTest01 = new ArrayList<Animal>();
    private List<? super Cat> wildcardTest02 = new ArrayList<Animal>();
    private List<? super Cat> wildcardTest03 = new ArrayList<Cat>();
    private List<?> wildcardTest04 = new ArrayList<Integer>();
    private List<?> wildcardTest05 = new ArrayList<Object>();

    public void legacyCodeTest() {

        myList.add(4);
        myList.add(13);

        insert(myList, "Leonardo");

        /* Without this loop it runs just fine
         * The problem is that generics exists
         * only in compile time. It casts the
         * generic type into the bytecode like
         * the example bellow:
         * 
         *    System.out.println((Integer) o);
         * 
         * So ClassCastException at runtime in
         * this case when trying to cast the 
         * string object "Leonardo" to Integer */
        for (Object o : myList) {
            System.out.println(o);
        }
    }

    //The legacy code (pre-generics) is supposed to work
    //with generics but it isn't always safe
    public void insert(List l, String s) {
        l.add(s);
    }

    public void addAnimalTest(List<Animal> animals) {

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Animal());

        printCollection(animals);
    }

    public void addDogTest(List<Dog> dogs) {

        dogs.add(new Dog());

        //not possible to add a Cat or super type Animal
        //to a List<Dog>
        //
        //dogs.add(new Animal());
        //dogs.add(new Cat());
        
        printCollection(dogs);
    }

    public void addDogAndSuperTest(List<? super Dog> animals) {
        animals.add(new Dog());
        animals.add(new Dog());

        printCollection(animals);
    }

    public void printCollection(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void addAnimalsHolder() {
        AnimalHolder animalsHolder = new AnimalHolder();

        animalsHolder.addAnimal(new Cat());
        animalsHolder.addAnimal(new Animal());
        animalsHolder.addAnimal(new Dog());

        //Can't add Integer to an Animal generic Class
        //animalsHolder.addAnimal(new Integer());

        printCollection(animalsHolder.getAnimals());
        System.out.println(Animal.getFirstAnimalFromList(animalsHolder.getAnimals()));
    }

    public static void main (String[] args) {

        Generics g = new Generics();

        //g.testLegacyCode();
        //g.addAnimalTest(g.animals);
        //g.addDogTest(g.dogs);
        //g.addDogAndSuperTest(g.animals);
        g.addAnimalsHolder();

    }
}

class Animal {

    public Animal() {}

    //generic contructor example
    public <T extends Animal> Animal(T animal) {
        System.out.println(animal);
    }

    public static <T extends Animal> T getFirstAnimalFromList(List<T> animal) {
        return animal.get(0);
    }

    public String toString() {
        return "I am an animal!";
    }
}

class Dog extends Animal {

    public String toString() {
        return "I am a dog!";
    }
}

class Cat extends Animal {
    
    public String toString() {
        return "Im am a cat!";
    }
}

class AnimalHolder<T extends Animal> {

    private List<T> animals = new ArrayList<T>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public List<T> getAnimals() {
        return animals;
    }
}

//Question marks doesn't work with class and method declarations
//It only works with reference variables. So the class declaration 
//bellow doesn't compile
//   class WrongUseOfGenericClassDeclaration <? extends Animal> {}
