package classAndMethods;

public class NullValue {

    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!"));

        // String s2 = null;                     runtime error
        // System.out.println(s2.concat("!!"));  null pointer exception
    }

}
