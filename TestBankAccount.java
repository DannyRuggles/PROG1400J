public class TestBankAccount {
    public static void main(String[] args) {
        // test default constructor
        BankAccount account1 = new BankAccount();
        account1.display();

        // test constructor to set all attributes
        BankAccount account2 = new BankAccount(12345, "John", "Doe", "123 Main St", 1000.0);
        account2.display();

        // test constructor to set all string attributes and default numeric attributes to 2
        BankAccount account3 = new BankAccount("Jane", "Doe", "456 Elm St");
        account3.display();

        // test deposit and withdraw methods
        account1.deposit(500.0);
        account1.display();

        account2.withdraw(250.0);
        account2.display();

        // test getters and setters
        account3.setAccountNumber(67890);
        account3.setCustomerAddress("789 Oak St");
        account3.setBalance(500.0);
    }
}
