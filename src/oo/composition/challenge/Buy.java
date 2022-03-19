package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Buy {

    final List<Item> items = new ArrayList<>();

    void addItem(Product product, int amount) {
        this.items.add(new Item(product, amount));
    }

    void addItem(String name, double price, int amount) {
        var product = new Product(name, price);
        this.items.add(new Item(product, amount));
    }

    double getTotalValue() {
        double total = 0;

        for(Item item: items) {
            total += item.amount * item.product.price;
        }

        return total;
    }

}
