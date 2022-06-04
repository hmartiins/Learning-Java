package oo.polymorphism;

public class Dinner {

    public static void main(String[] args) {
        People people = new People(99.65);
        System.out.println(people.getWeight());

        Rice rice = new Rice(0.2);
        Bean bean = new Bean(0.1);

        people.toEat(rice);
        people.toEat(bean);

        System.out.println(people.getWeight());

        Icecream icecream = new Icecream(0.4);
        people.toEat(icecream);

        System.out.println(people.getWeight());
    }
}
