

public class BankAccount {
    double accountNumber;
    double balance;
    String customerName;
    String Email;
    String phoneNumber;

    public BankAccount(){
        this(25623,0,"defaultName","Default Email","default phone");
        System.out.println("Empty Constructor called");
    }
    public BankAccount(double accountNumber, double balance, String customerName, String Email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.customerName = customerName;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999,100.55,customerName, email, phoneNumber);
    }

    public double getAccountNumber (){
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    double deposit;

    public void deposit(double depositAmount) {
       this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if(this.balance-withdrawalAmount <0) {
            System.out.println("only" + this.balance + " available. Withdrawal not processed");
        }
        else {
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + balance);
        }
    }
}
