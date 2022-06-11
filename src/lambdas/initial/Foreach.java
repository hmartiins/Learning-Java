package lambdas.initial;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Sus");

        for(String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01");
        approved.forEach(name -> System.out.println(name));

        System.out.println("\nLambda #02");
        approved.forEach(name -> printName(name));

        System.out.println("\nMethod Reference #01");
        approved.forEach(System.out::println);

        System.out.println("\nMethod Reference #01");
        approved.forEach(Foreach::printName);

    }

    static void printName(String name) {
        System.out.println("Hi, my name is: " + name);
    }

}
