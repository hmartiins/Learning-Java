package oo.inheritance.test;

import oo.inheritance.challenge.Ferrari;
import oo.inheritance.challenge.Gol;

public class CarTest {

    public static void main(String[] args) {
        var ferrari = new Ferrari();
        var gol = new Gol();

        System.out.println("Velocidade atual da Ferrari: " + ferrari.currentSpeed);
        System.out.println("Velocidade atual do Gol: " + gol.currentSpeed);

        ferrari.speedUp();
        ferrari.turnOnNitro();
        ferrari.turnOnAir();
        ferrari.speedUp();
        ferrari.speedUp();

        gol.speedUp();
        gol.speedUp();
        gol.speedUp();

        System.out.println("Velocidade atual da Ferrari: " + ferrari.currentSpeed);
        System.out.println("Velocidade atual do Gol: " + gol.currentSpeed);

    }

}
