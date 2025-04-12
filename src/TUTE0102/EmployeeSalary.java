package TUTE0102;

import java.util.Scanner;
public class EmployeeSalary {
    private char employeeType;
    private double basicSalary;
    private int otHours;
    private int otRate;
    private double totalSalary;

    //default constructor
    public EmployeeSalary() {
        this.employeeType = '0';
        this.basicSalary = 0.0;
        this.otHours = 0;
        this.otRate = 0;
    }

    //overloaded constructor
    public EmployeeSalary(char employeeType, double basicSalary, int otHours) {
        this.employeeType = employeeType;
        this.basicSalary = basicSalary;
        this.otHours = otHours;
    }

    public void setEmployeeType(char employeeType) {
        this.employeeType = employeeType;
    
    if(employeeType == '1'){
        this.otRate = 1000;
    }else if(employeeType == '2'){
        this.otRate = 1500;
    }else if(employeeType == '3'){
        this.otRate = 1700;
    }else {
        System.out.println("Invalid employee type");
        this.otRate = 0;
    }
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void setOTHourse(int otHours) {
        this.otHours = otHours;
    }

    public void calculateTotalSalary(){
        double totalSalary = basicSalary + (otHours * otRate);
        System.out.println("Employee Total Salary is : Rs." + totalSalary);
    }

    public static void main(String[] args) {

        EmployeeSalary employee1 = new EmployeeSalary();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee type (1, 2, or 3): ");
        employee1.setEmployeeType(input.next().charAt(0));
        
        System.out.print("Enter basic salary: ");
        employee1.setBasicSalary(input.nextDouble());

        System.out.print("Enter overtime hours: ");
        employee1.setOTHourse(input.nextInt());

        employee1.calculateTotalSalary();

    }
    
}
