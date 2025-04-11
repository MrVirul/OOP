package TUTE01;

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
    public String getaccountHolderName(){
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
        }
    }
public static void main(String[] args) {
    
}

}
