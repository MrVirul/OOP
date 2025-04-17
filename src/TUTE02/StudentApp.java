package TUTE02;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        student1.setStudentID(input.nextInt());

        System.out.print("Enter Student Name: ");
        student1.setStudentName(input.nextLine());
        input.nextLine(); 

        System.out.print("Enter Student GPA: ");
        student1.setGPA(input.nextDouble());

        student1.displayStudentDetails();
    }
}
