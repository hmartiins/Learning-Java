package arrays;

public class ForEach {
    public static void main(String[] args) {
        double[] grades = { 6.9, 7.3, 7.9, 10 };

        for(double grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
