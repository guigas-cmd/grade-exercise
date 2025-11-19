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

        System.out.print("Enter the tree grades: ");

        for(int i=1; i<=3; i++){
            student.grade = sc.nextDouble();
            student.finalGrade += student.grade;
        }


        sc.close();
    }
}
