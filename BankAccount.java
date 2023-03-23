//Author = Danny Ruggles
//Filename = smallestint.java


public class BankAccount {
    private int accountNumber;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private double balance;

    // Default constructor
    public BankAccount() {
        this.accountNumber = 2;
        this.customerFirstName = "empty";
        this.customerLastName = "empty";
        this.customerAddress = "empty";
        this.balance = 2.0;
    }

    // Constructor to set all attributes
    public BankAccount(int accountNumber, String customerFirstName, String customerLastName,
                       String customerAddress, double balance) {
        this.accountNumber = accountNumber;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.balance = balance;
    }

    // Constructor to set all string attributes and default numeric attributes to 2
    public BankAccount(String customerFirstName, String customerLastName, String customerAddress) {
        this.accountNumber = 2;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.balance = 2.0;
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit and withdraw methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    // Display method
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerFirstName + " " + customerLastName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Balance: $" + balance);
    }
}


//public class TestBankAccount {
//    public static void main(String[] args) {
//        // test default constructor
//        BankAccount account1 = new BankAccount();
//        account1.display();
//
//        // test constructor to set all attributes
//        BankAccount account2 = new BankAccount(12345, "John", "Doe", "123 Main St", 1000.0);
//        account2.display();
//
//        // test constructor to set all string attributes and default numeric attributes to 2
//        BankAccount account3 = new BankAccount("Jane", "Doe", "456 Elm St");
//        account3.display();
//
//        // test deposit and withdraw methods
//        account1.deposit(500.0);
//        account1.display();
//
//        account2.withdraw(250.0);
//        account2.display();
//
//        // test getters and setters
//        account3.setAccountNumber(67890);
//        account3.setCustomerAddress("789 Oak St");
//        account3.setBalance(500.0);
//    }
//}
