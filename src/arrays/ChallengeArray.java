package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de notas a serem informadas: ");
        int totalGrades = sc.nextInt();

        double[] studentGrades = new double[totalGrades];

        for (int i = 0; i < totalGrades; i++) {
            System.out.print("Informe a " + (i + 1) + "º nota do aluno: ");
            studentGrades[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (double studentGrade: studentGrades) {
            sum += studentGrade;
        }

        System.out.println("\nMédia das notas do aluno: " + (sum / totalGrades));

        sc.close();
    }

}
