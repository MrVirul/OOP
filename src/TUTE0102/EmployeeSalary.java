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
    }

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

    public set BasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }
    public void setOTHourse(int OTHourse) {
        this.OTHourse = OTHourse;
    }

    public calculateTotalSalary(){
        totalSalary = BasicSalary + (OTHourse * OTRate);
        return totalSalary;
    }

    public static void main(String[] args) {
        
        EmployeeSalary employee1 = new EmployeeSalary();
        Scanner input = new Scanner(System.in);

    }
    
}
