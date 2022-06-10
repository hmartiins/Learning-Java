package oo.inheritance.challenge;

public class Car {

    public final int MAX_SPEED;

    public int currentSpeed = 0;
    private int delta = 5;

    protected Car(int max_speed) {
        MAX_SPEED = max_speed;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void speedUp() {
        if(this.currentSpeed + getDelta() > MAX_SPEED) {
            this.currentSpeed = MAX_SPEED;
        } else {
            this.currentSpeed += getDelta();
        }
    }

    public void speedDown() {
        if (this.currentSpeed >= getDelta()) {
            this.currentSpeed -= getDelta();
        } else {
            this.currentSpeed = 0;
        }
    }
}
