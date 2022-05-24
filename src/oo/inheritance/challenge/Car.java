package oo.inheritance.challenge;

public class Car {

    final int MAX_SPEED;

    int currentSpeed = 0;
    int delta = 5;

    public Car(int max_speed) {
        MAX_SPEED = max_speed;
    }

    public void speedUp() {
        if(this.currentSpeed + delta > MAX_SPEED) {
            this.currentSpeed = MAX_SPEED;
        } else {
            this.currentSpeed += delta;
        }
    }

    public void speedDown() {
        if (this.currentSpeed >= delta) {
            this.currentSpeed -= delta;
        } else {
            this.currentSpeed = 0;
        }
    }
}
