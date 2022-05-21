package oo.inheritance.challenge;

public class CarTest {

    public static void main(String[] args) {
        var ferrari = new Ferrari();
        var gol = new Gol();
        System.out.println("Velocidade atual da Ferrari: " + ferrari.currentSpeed);
        System.out.println("Velocidade atual do Gol: " + gol.currentSpeed);

        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        gol.speedUp();
        gol.speedUp();
        gol.speedUp();

        System.out.println("Velocidade atual da Ferrari: " + ferrari.currentSpeed);
        System.out.println("Velocidade atual do Gol: " + gol.currentSpeed);

    }

}
