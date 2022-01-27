package classAndMethods.challenge;

public class HaveDinner {

    public static void main(String[] args) {
        var food1 = new Food("Arroz", 0.33);
        var food2 = new Food("Feijão", 0.22);

        var people = new People("Henrique", 80.33);

        System.out.println("Nome: " + people.name + "\nPeso antes de comer: " + people.weight);

        people.toEat(food1);
        people.toEat(food2);

        System.out.println("Peso depois de comer: " + people.weight);
    }

}
