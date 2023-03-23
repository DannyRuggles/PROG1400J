//Author = Danny Ruggles
//Filename = myArea.java


import java.util.Scanner;

public class myArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in meters: ");
        double length = input.nextDouble();

        System.out.print("Enter the width in meters: ");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("The area is " + area + " square meters.");
    }
}
