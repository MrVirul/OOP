package Lab06.Question01;

public class Main {
    public static void main(String []args){
         RegularCourse RegC1 = new RegularCourse();
         PremiumCourse PreC2 = new PremiumCourse("SE001","Software Engineering",5,true);

         RegC1.calculateTotalFee();
         PreC2.calculateTotalFee();

        System.out.println("===Regular Course (Default Constructor===)");
         RegC1.displayCourseDetails();

        System.out.println();
        System.out.println();

        System.out.println("===Premium Course (Parameterized Constructor)===");
         PreC2.displayCourseDetails();
    }
}
