package Lab09.Question03;

public class Student {
    String studentID;
    String studentName;
    static String universityName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public void displayStudentInfo(){
        System.out.println("Student name is : " + studentName);
        System.out.println("Student ID : " + studentID);
        System.out.println("Student university is : " + universityName + "\n");
    }
}

