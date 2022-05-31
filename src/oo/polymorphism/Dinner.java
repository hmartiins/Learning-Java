package oo.polymorphism;

public class Dinner {

    public static void main(String[] args) {
        People people = new People(68.98);
        System.out.println(people.getWeight());

        Rice rice = new Rice(0.2);
        Bean bean = new Bean(0.4);

        people.toEat(rice);
        people.toEat(bean);

        System.out.println(people.getWeight());
    }
}
