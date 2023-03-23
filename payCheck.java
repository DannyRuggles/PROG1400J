//Author = Danny Ruggles
//Filename = payCheck.java


import java.util.Scanner;

public class payCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = input.nextDouble();

        double grossPay = hourlyRate * hoursWorked;
        double withholdingTax = 0.1 * grossPay;
        double netPay = grossPay - withholdingTax;

        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.printf("Withholding Tax: $%.2f%n", withholdingTax);
        System.out.printf("Net Pay: $%.2f%n", netPay);
    }
}
