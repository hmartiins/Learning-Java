package oo.composition;

public class Item {

    String name;
    int amount;
    double price;

    Buy buy;

    Item(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

}
