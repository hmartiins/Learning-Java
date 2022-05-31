package oo.polymorphism;

public class People {

    private double weight;

    public People(double weight) {
        setWeight(weight);
    }

    public void toEat(Rice rice) {
        this.weight += rice.getWeight();
    }
    public void toEat(Bean bean) {
        this.weight += bean.getWeight();
    }
    public void toEat(Icecream icecream) {
        this.weight += icecream.getWeight();
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
