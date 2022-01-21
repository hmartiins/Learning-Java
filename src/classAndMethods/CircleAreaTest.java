package classAndMethods;

public class CircleAreaTest {

    public static void main(String[] args) {
        CircleArea a = new CircleArea(5);

        System.out.println(a.calcArea());
        System.out.println(CircleArea.calcArea(10));
    }

}
