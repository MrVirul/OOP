package TUTE02.Question04;
import java.util.Scanner;
public class CustomerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer1 = new Customer();

        System.out.print("Enter Customer ID: ");
        input.nextInt(customer1.getCustomerId());

        System.out.println("Enter Customer Name: ");
        input.next(customer1.getCustomerName());

        System.out.println("Enter Units Consumed: ");
        input.nextInt(customer1.getUnitConsumed());

        System.out.println();
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println();
        customer1.displayCustomerDetails();
    }
}
