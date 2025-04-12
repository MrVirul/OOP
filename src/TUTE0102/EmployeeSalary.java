package TUTE0102;

import java.util.Scanner;
public class EmployeeSalary {
    private char employeeType;
    private double BasicSalary;
    private int OTHourse;
    private int OTRate;
    private double totalSalary;

    //default constructor
    public EmployeeSalary() {
        this.employeeType = '0';
        this.BasicSalary = 0.0;
        this.OTHourse = 0;
        this.OTRate = 0;
    }

    //overloaded constructor
    public EmployeeSalary(char employeeType, double BasicSalary, int OTHourse){
        this.employeeType = employeeType;
        this.BasicSalary = BasicSalary;
        this.OTHourse = OTHourse;
    }

    public void setEmployeeType(char employeeType) {
        this.employeeType = employeeType;

    if(employeeType == '1'){
        this.OTRate = 1000;
    }else if(employeeType == '2'){
        this.OTRate = 1500;
    }else if(employeeType == '3'){
        this.OTRate = 1700;
    }else {
        System.out.println("Invalid employee type");
        this.OTRate = 0;
    }
    }    
    public void setEmployeeType(char employeeType) {
        this.employeeType = employeeType;
    
        if (employeeType == '1') {
            this.OTRate = 1000;
        } else if (employeeType == '2') {
            this.OTRate = 1500;
        } else if (employeeType == '3') {
            this.OTRate = 1700;
        } else {
            System.out.println("Invalid employee type");
            this.OTRate = 0;
        }
    }
    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }
    public void setOTHourse(int OTHourse) {
        this.OTHourse = OTHourse;
    }

    public void calculateTotalSalary(){
        totalSalary = BasicSalary + (OTHourse * OTRate);
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
