package io.study.java.examples.abstract_example.animal;

public class AnimalProgram {
    public static void main(String[] args) {

        Animal animal = new Dog();
        Animal animal1 = new Cat();
        Dog dog = new Dog();
        Cat cat = new Cat();


        cat.run();
        dog.run();
        animal1.run();
        animal.run();


    }

}
