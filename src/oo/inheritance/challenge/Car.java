package oo.inheritance.challenge;

public class Car {

    public final int MAX_SPEED;

    public int currentSpeed = 0;
    protected int delta = 5;

    protected Car(int max_speed) {
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
