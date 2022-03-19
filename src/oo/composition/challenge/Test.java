package oo.composition.challenge;

public class Test {

    public static void main(String[] args) {

        Client client = new Client("Henrique");

        Buy buy1 = new Buy();
        buy1.addItem("Caneta", 3.99, 3);
        buy1.addItem(new Product("Monitor", 659.98), 1);

        Buy buy2 = new Buy();
        buy2.addItem("Lapis", 2.99, 1);
        buy2.addItem(new Product("Impressora", 257.89), 1);

        client.addBuy(buy1);
        client.buys.add(buy2);

        System.out.println("R$: " + client.getTotalValue());

    }

}
