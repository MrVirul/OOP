package TUTE01;

import java.util.Scanner;
public class SavingAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    //default constructor
    public SavingAccount(){
        this.accountNumber = 0;
        this.accountHolderName = "No name";
        this.balance = 0.00;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void depositAmount(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            System.out.println("Deposited " + amount + " to account number " + accountNumber + " account balance is " + balance);
        }else{
            System.out.println("Invalid amount to deposit!!!");
        }}
        public void withdrawAmount(double amount){
            if(amount > 0 && amount <= balance){
                this.balance = this.balance - amount;
                System.out.println("Withdraw " + amount + " from account number " + accountNumber + " account balance is " + balance);
            }
        else{
            System.out.println("Invalid amount to withdraw!!!");
        }
    }
    public void displayAccountDetails(){
        System.out.println();
        System.out.println("=============================================");
        System.out.println("Account Details:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Account Balance: " + getBalance());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingAccount account1 = new SavingAccount();

        System.out.print("Enter account number: ");
        account1.setAccountNumber(input.nextInt());
        input.nextLine();

        System.out.print("Enter account holder name: ");
        account1.setAccountHolderName(input.nextLine());

        System.out.print("Enter initial deposit: ");
        account1.depositAmount(input.nextDouble());

        System.out.print("Enter Deposit amount: ");
        account1.depositAmount(input.nextDouble());

        System.out.print("Enter Withdraw amount: ");
        account1.withdrawAmount(input.nextDouble());

        account1.displayAccountDetails();
    }

}
