package oo.inheritance;

public class Game {

    public static void main(String[] args) {

        Hero p1 = new Hero();
        p1.x = 10;
        p1.y = 10;

        Player p2 = new Monster();
        p2.x = 10;
        p2.y = 11;

        p1.walk(Direction.NORTH);
        p2.walk(Direction.NORTH);

        System.out.println(p1.life);
        System.out.println(p2.life);

        p1.attack(p2);
        p2.attack(p1);

        System.out.println(p1.life);
        System.out.println(p2.life);

    }
}
