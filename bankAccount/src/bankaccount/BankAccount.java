
package bankaccount;

public class BankAccount {
    private double balance;
    private String accountNumber;
    public void deposit(double amount){
        balance += amount;
    
    }
    public void withdraw(double amount){
        if(amount<= balance){
            balance -= amount;
        }
        else{
            System.err.println("insufficient fund.");
        }
    }
    public double getBalance(){
        return balance;
        
    }
    public void transfer (double amount, BankAccount otherAccount){
        otherAccount.deposit(amount);
        if(amount <= balance){
        
        balance -= amount;
    } 
    else{
            System.err.println("insufficient fund.");
            System.exit(0);
        }
}
    public static void main(String[] args) {
        BankAccount rob = new BankAccount();
        rob.deposit(900);
        
        BankAccount david = new BankAccount();
        david.deposit(2000);
        // do a transfer...
        rob.transfer(100, david);
        //check that the transaction was successful
        System.out.println(rob.getBalance());
        System.out.println(david.getBalance());
        
    }
    
}
