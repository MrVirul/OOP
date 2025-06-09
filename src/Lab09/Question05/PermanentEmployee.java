package Lab09.Question05;

import javax.naming.Name;

public class PermanentEmployee extends Employee implements Payable{
    static double monthlySalary = 30000.00;

    public PermanentEmployee(String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Employee name is : "+ name + "\nEmployee ID is : " + employeeId + "\nMonthly payment is : " + calculateSalary());
    }
}
