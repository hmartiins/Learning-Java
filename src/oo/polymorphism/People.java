package oo.polymorphism;

public class People {

    private double weight;

    public People(double weight) {
        setWeight(weight);
    }

    public void toEat(Food food) {
        this.weight += food.getWeight();
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
