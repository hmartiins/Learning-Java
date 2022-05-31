package oo.polymorphism;

public class Icecream {

    private double weight;

    public Icecream(double weight) {
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

}
