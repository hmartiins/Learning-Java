package lambdas.initial;

public class Sum implements Calc {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }

}
