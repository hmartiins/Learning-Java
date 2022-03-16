package oo.composition;

public class Engine {

    Car car;
    boolean hasOn = false;
    double factorInjection = 1;

    Engine(Car car) {
        this.car = car;
    }

    int spins() {
        if(!hasOn) {
            return 0;
        } else {
            return (int) Math.round(factorInjection * 3000);
        }
    }

}
