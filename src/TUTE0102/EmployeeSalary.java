package TUTE0102;

public class EmployeeSalary {
    private char employeeType;
    private double BasicSalary;
    private int OTHourse;
    private double OTRate;

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

    public char getEmployeeType(double OTRate){
        if(employeeType == '1'){
            return OTRate = 1000;
        }else if(employeeType == '2'){
            return OTRate = 1500;
        }else if(employeeType == '3'){
            return OTRate = 1700;
    }else{
            return OTRate = 0;
        }
    }
}
