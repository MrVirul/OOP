package TUTE01;//Question 01

import java.util.Scanner;

public class Student {
    private String name;
    private int assigmentMarks;
    private int examMarks;

    //default
   public Student() {
        this.name = "No name";
        this.assigmentMarks = 0;
        this.examMarks = 0;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssigmentMarks() {
        return assigmentMarks;
    }

    public void setAssigmentMarks(int assigmentMarks) {
        if(assigmentMarks <= 100 && assigmentMarks >= 0){
            this.assigmentMarks = assigmentMarks;
        } else{
            System.out.println("Invalid assigment marks");
        }
    }

    public int getExamMarks() {
        return examMarks;
    }

    public void setExamMarks(int examMarks) {
        if(examMarks <= 100 && examMarks >= 0){
            this.examMarks = examMarks;
        } else {
            System.out.println("Invalid exam marks");
        }
    }
    public char finalGrade(){
        double finalGrade = (examMarks * 0.4) + (assigmentMarks * 0.6);
        if(finalGrade >= 80 && finalGrade <= 100){
            return 'A';
        } else if (finalGrade >= 65 && finalGrade < 80) {
            return 'B';
        } else if (finalGrade >= 50 && finalGrade<65) {
            return 'C';
        }else
            return 'f';
    }
    public void showDetails(){
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("Student Name is : " + getName());
        System.out.println("Assigment Marks is : " + getAssigmentMarks());
        System.out.println("Exam Marks is : " + getExamMarks());
        System.out.println("Final Grade is : " + finalGrade());
    }
    public static void main(String[] args) {

        Student student1 = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        student1.setName(input.nextLine());

        System.out.print("Enter assigment Marks : ");
        student1.setAssigmentMarks(input.nextInt());

        System.out.print("Enter exam marks : ");
        student1.setExamMarks(input.nextInt());

        student1.showDetails();
    }
}

