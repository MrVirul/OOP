package TUTE0102;

public class EmployeeSalary {
    private char employeeType;
    private double BasicSalary;
    private int OTHourse;

    //default constructor
    public EmployeeSalary() {
        this.employeeType = '0';
        this.BasicSalary = 0.0;
        this.OTHourse = 0;
    }

    //overloaded constructor
    public EmployeeSalary(char employeeType, double BasicSalary, int OTHourse){
        this.employeeType = employeeType;
        this.BasicSalary = BasicSalary;
        this.OTHourse = OTHourse;
    }

}
