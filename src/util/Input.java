package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.printf("Invalid input. Enter an integer between %d and %d: ", min, max);
            }
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < min || number > max);
        return number;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Invalid input. Enter an integer: ");
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.printf("Enter a decimal number between %f and %f: ", min, max);
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.printf("Invalid input. Enter a decimal number between %f and %f: ", min, max);
            }
            number = scanner.nextDouble();
            scanner.nextLine();
        } while (number < min || number > max);
        return number;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Invalid input. Enter a decimal number: ");
        }
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }
}
