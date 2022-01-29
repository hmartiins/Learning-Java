package arrays;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade dos alunos: ");
        int numStudents = sc.nextInt();
        System.out.print("Informe a quantidade de notas: ");
        int totalGrades = sc.nextInt();

        double[][] classGrades = new double[numStudents][totalGrades];

        double total = 0;
        for (int student = 0; student < classGrades.length; student++) {
            for (int grades = 0; grades < classGrades[student].length; grades++) {
                System.out.printf("Informe a nota %d do aluno %d: ", student + 1, grades + 1);

                classGrades[student][grades] = sc.nextDouble();
                total += classGrades[student][grades];
            }
        }

        double gradeAvarage = total / (totalGrades * numStudents);
        System.out.println("\nA média da turma é: " + gradeAvarage);

        sc.close();
    }

}
