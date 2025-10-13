package HierarchicalInheritence_Problems;
class BankAccount {
 String accountNumber;
 double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }
}
class SavingsAccount extends BankAccount {
 double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Savings Account");
     displayAccountDetails();
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}
class CheckingAccount extends BankAccount {
 double withdrawalLimit;

 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Checking Account");
     displayAccountDetails();
     System.out.println("Withdrawal Limit: $" + withdrawalLimit);
 }
}
class FixedDepositAccount extends BankAccount {
 int maturityPeriod; 

 public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
     super(accountNumber, balance);
     this.maturityPeriod = maturityPeriod;
 }
 public void displayAccountType() {
     System.out.println("Account Type: Fixed Deposit Account");
     displayAccountDetails();
     System.out.println("Maturity Period: " + maturityPeriod + " months");
 }
}
public class BankSystem {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("SA1001", 5000.0, 4.5);
     CheckingAccount ca = new CheckingAccount("CA2002", 3000.0, 1000.0);
     FixedDepositAccount fda = new FixedDepositAccount("FD3003", 10000.0, 12);

     sa.displayAccountType();
     System.out.println(" ");
     ca.displayAccountType();
     System.out.println(" ");
     fda.displayAccountType();
 }
}
