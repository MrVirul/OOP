package Lab09.Question05;

public class ContractEmployee extends Employee implements Payable  {
    int hours;
    Double payPerHour;

    public ContractEmployee(String employeeId, String name, int hours, Double payPerHour) {
        super(employeeId, name);
        this.hours = hours;
        this.payPerHour = payPerHour;
    }

    @Override
    public double calculateSalary() {
        return hours * payPerHour;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Employee name is : "+ name + "\nEmployee ID is : " + employeeId + "\nMonthly payment is : " + calculateSalary());
    }
}
