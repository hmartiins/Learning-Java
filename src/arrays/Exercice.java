package arrays;

import java.util.Arrays;

public class Exercice {
    public static void main(String[] args) {
        double[] studentGradesA = new double[3];

        studentGradesA[0] = 7.9;
        studentGradesA[1] = 5.9;
        studentGradesA[2] = 9.9;

        System.out.println(Arrays.toString(studentGradesA));

        double totalA = 0;
        for(int i = 0; i < studentGradesA.length; i++) {
            totalA += studentGradesA[i];
        }

        System.out.println(totalA / studentGradesA.length);

        double[] studentGradesB = { 6.9, 7.3, 4.3, 10 };

        double totalB = 0;
        for (double v : studentGradesB) {
            totalB += v;
        }

        System.out.println(totalB / studentGradesB.length);
    }
}
