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
public static void main(String[] args) {
    
}

}
