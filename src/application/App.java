package application;
import entities.StudentC;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        StudentC student = new StudentC();

        System.out.print("Student Name: ");
        student.studentName = sc.nextLine();

        double finalGrade = 0; // armazena os scanners digitados dentro do for

        for(int i=1; i<=3; i++){
            System.out.print("Enter the tree grades: ");
            student.grade = sc.nextDouble();
            finalGrade = finalGrade + student.grade;

        }



        sc.close();
    }
}
