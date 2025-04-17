package TUTE02.Question04;
import java.util.Scanner;
public class CustomerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer1 = new Customer();

        System.out.print("Enter Customer ID: ");
        customer1.setCustomerId(input.nextInt());

        System.out.print("Enter Customer Name: ");
        customer1.setCustomerName(input.next());

        System.out.print("Enter Units Consumed: ");
        customer1.setUnitConsumed(input.nextInt());

        System.out.println();
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println();
        customer1.displayCustomerDetails();
        System.out.println();
    }
}
