package TUTE02.Question01;

public class Student {
    private int studentID;
    private String studentName;
    private  double GPA;

    public Student(int studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public Student() {
        this.studentID = 0;
        this.studentName = "Unknown";
        this.GPA = 0.0;
    }

    public double getGPA() {
        return GPA;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGPA(double GPA) {
        if(GPA >= 0.0 && GPA <= 4.0) {
            this.GPA = GPA;
        }else {
            System.out.println("Invalid GPA. It should be between 0.0 and 4.0.");
        }
        }
        public void displayStudentDetails() {
            
            System.out.println();
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Name: " + studentName);
            System.out.println("GPA: " + GPA);
            
        }

}
