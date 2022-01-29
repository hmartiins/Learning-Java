package classAndMethods;

public class Equals {

    public static void main(String[] args) {
        var user1 = new User();
        user1.name = "Henrique";
        user1.email = "henrique@martins.com";

        var user2 = new User();
        user2.name = "Henrique";
        user2.email = "henrique@martins.com";

        System.out.println(user1.equals(user2));

        System.out.println(user1.equals(new Date()));
    }

}
