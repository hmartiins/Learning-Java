package oo.composition;

public class Car {

    Engine engine;

    Car() {
        this.engine = new Engine(this);
    }

    void speedUp() {
        if (engine.factorInjection < 2.6) {
            engine.factorInjection += 0.4;
        }
    }

    void speedDown() {
        if (engine.factorInjection > 0.5) {
            engine.factorInjection -= 0.4;
        }
    }

    void turnOn() {
        engine.hasOn = true;
    }

    void turnOff() {
        engine.hasOn = false;
    }

    boolean hasOn() {
        return engine.hasOn;
    }
}
