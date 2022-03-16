package oo.composition;

public class CarTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.hasOn());

        c1.turnOn();
        System.out.println(c1.hasOn());

        System.out.println(c1.engine.spins());

        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        System.out.println(c1.engine.spins());

        c1.speedDown();
        c1.speedDown();
        c1.speedDown();
        System.out.println(c1.engine.spins());

        c1.speedDown();
        c1.speedDown();
        c1.speedDown();
        c1.speedDown();
        c1.speedDown();
        System.out.println(c1.engine.spins());
        // lacked encapsulation!!
        // c1.engine.factorInjection = -30;

        // bidirectional relationship
        System.out.println(c1.engine.car.engine.car.engine.spins());
    }

}
