package oo.abstracts;

public class TestAbstract {

    public static void main(String[] args) {

        Animal animal = new Dog();
        System.out.println(animal.move());
        System.out.println(animal.breathe());

    }

}
