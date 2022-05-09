package oo.composition;

import java.util.ArrayList;

public class Buy {

    String clientName;
    ArrayList<Item> items = new ArrayList<Item>() ;

    void addItem(String name, int amount, double price) {
        this.addItem(new Item(name, amount, price));
    }

    void addItem(Item item) {
        items.add(item);
        item.buy = this;
    }

    double getTotalValue() {
        double total = 0;

        for(Item item: items) {
            total += item.amount * item.price;
        }

        return total;
    }

}
