package oo.composition;

public class CarroTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOn();
        System.out.println(c1.isOn());

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

    }

}
