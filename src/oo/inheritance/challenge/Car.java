package oo.inheritance.challenge;

public class Car {

    int currentSpeed = 0;

    public void speedUp() {
        this.currentSpeed += 5;
    }

    public void speedDown() {
        if (this.currentSpeed >= 5) {
            this.currentSpeed -= 5;
        } else {
            this.currentSpeed = 0;
        }
    }
}
