package classAndMethods;

public class CircleArea {
    double radius;
    static final double PI = Math.PI;

    CircleArea(double initialRadius) {
        radius = initialRadius;
    }

    double calcArea() {
        return PI * radius * radius;
    }

    static double calcArea(double radius) {
        return PI * radius * radius;
    }
}
