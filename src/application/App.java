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

        if(student.finalGrade < 60){
            System.out.printf("FINAL GRADE = %.2f \n", student.finalGrade);
            System.out.println("FAILED");
            student.finalGrade = 60 - student.finalGrade;
            System.out.printf("MISSING %.2f POINTS", student.finalGrade);

        }
        else{
        System.out.printf("FINAL GRADE = %.2f \n ", student.finalGrade);
        System.out.println("PASS");

        }


        sc.close();
    }
}
