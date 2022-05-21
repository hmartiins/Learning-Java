package oo.inheritance;

public class Game {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.x = 10;
        hero.y = 10;

        Player monster = new Monster();
        monster.x = 10;
        monster.y = 11;

        hero.walk(Direction.NORTH);
        monster.walk(Direction.NORTH);

        System.out.println("Herói tem: " + hero.life + " de vida.");
        System.out.println("Monstro tem: " + monster.life + " de vida.");

        hero.attack(monster);
        monster.attack(hero);

        System.out.println("\nHerói tem: " + hero.life + " de vida.");
        System.out.println("Monstro tem: " + monster.life + " de vida.");

    }
}
