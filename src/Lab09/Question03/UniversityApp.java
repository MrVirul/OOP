package Lab09.Question03;

public class UniversityApp {

    public static void main(String[] args) {
        Student.universityName = "SLIIT";
        Student student1 = new Student("IT2410", "Virul");
        Student student2 = new Student("IT2411", "Senesh");
        Student student3 = new Student("IT2412", "Achira");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        System.out.println();
        Student.universityName = "UoC";
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}
