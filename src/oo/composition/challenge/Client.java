package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {

    final String name;
    final List<Buy> buys = new ArrayList<>();

    Client(String name) {
        this.name = name;
    }

    void addBuy(Buy buy) {
        this.buys.add(buy);
    }

    double getTotalValue() {
        double total = 0;

        for(Buy buy: buys) {
            total += buy.getTotalValue();
        }

        return total;
    }

}
