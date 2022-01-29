package arrays;

import java.util.Arrays;

public class Exercice {
    public static void main(String[] args) {
        double[] studentGradeA = new double[3];

        studentGradeA[0] = 7.9;
        studentGradeA[1] = 5.9;
        studentGradeA[2] = 9.9;

        System.out.println(Arrays.toString(studentGradeA));

        double totalA = 0;
        for(int i = 0; i < studentGradeA.length; i++) {
            totalA += studentGradeA[i];
        }

        System.out.println(totalA / studentGradeA.length);

        double[] studentGradeB = { 6.9, 7.3, 4.3, 10 };

        double totalB = 0;
        for (double v : studentGradeB) {
            totalB += v;
        }

        System.out.println(totalB / studentGradeB.length);
    }
}
