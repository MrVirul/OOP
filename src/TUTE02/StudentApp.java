package TUTE02;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        student1.setStudentID(input.nextInt());

        System.out.println("Enter Student Name: ");
        student1.setStudentName(input.nextLine());

        System.out.println("Enter Student GPA: ");
        student1.setGPA(input.nextDouble());

        student1.displayStudentDetails();
    }
}
