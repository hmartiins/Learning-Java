package oo.composition;

public class BuyTest {

    public static void main(String[] args) {

        Buy buy1 = new Buy();
        buy1.clientName = "Henrique";

        buy1.addItem("Caderno", 4, 13.99);
        buy1.addItem(new Item("Lapis", 1, 2.89));
        buy1.items.add(new Item("Caneta", 3, 4.99));

        System.out.println(buy1.items.size());
        System.out.println(buy1.getTotalValue());

    }
}
