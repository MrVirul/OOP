package Lab09.Question05;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("A001","Virul");
        ContractEmployee contractEmployee = new ContractEmployee("A002","Sensh",7,1500.00);

        permanentEmployee.calculateSalary();
        contractEmployee.calculateSalary();

        permanentEmployee.generatePaySlip();
        System.out.println();
        contractEmployee.generatePaySlip();
    }
}
