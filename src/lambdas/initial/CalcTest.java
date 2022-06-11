package lambdas.initial;

public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Sum();
        System.out.println(calc.execute(2, 3));

        calc = new Multiply();
        System.out.println(calc.execute(2, 3));

    }

}
