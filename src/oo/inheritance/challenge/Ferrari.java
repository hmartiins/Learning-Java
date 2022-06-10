package oo.inheritance.challenge;

public class Ferrari extends Car implements Sporting, Lux {

    private boolean turnOnAir;
    private boolean turnOnNitro;

    public Ferrari() {
        super(225);
        setDelta(15);
    }

    @Override
    public void turnOnNitro() {
        turnOnNitro = true;
    }

    @Override
    public void turnOffNitro() {
        turnOnNitro = false;
    }

    @Override
    public void turnOnAir() {
        turnOnAir = true;
    }

    @Override
    public void turnOffAir() {
        turnOnAir = false;
    }

    @Override
    public int getDelta() {
        if (turnOnNitro && !turnOnAir) {
            return 35;
        } else if (turnOnNitro) {
            return 30;
        } else if (!turnOnAir) {
            return 20;
        } else {
            return 15;
        }
    }
}
