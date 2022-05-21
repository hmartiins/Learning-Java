package oo.inheritance.challenge;

public class Ferrari extends Car {

    @Override
    public void speedUp() {
        super.speedUp();
        super.speedUp();
        super.speedUp();
    }

    @Override
    public void speedDown() {
        super.speedDown();
        super.speedDown();
        super.speedDown();
    }
}
