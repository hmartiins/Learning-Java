package classAndMethods.challenge;

public class People {

    String name;
    double weight;

    People(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void toEat(Food food) {
        if (food == null) return;
        weight += food.weight;
    }

}
