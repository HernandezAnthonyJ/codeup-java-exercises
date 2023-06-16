import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test arithmetic methods
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));

        // Test multiplication without the * operator
        System.out.println("Multiplication without *: " + multiplyWithoutOperator(num1, num2));

        // Test multiplication with recursion
        System.out.println("Multiplication with recursion: " + multiplyWithRecursion(num1, num2));

        // Test getInteger method
        int userInput = getInteger(1, 10);
        System.out.println("Valid input: " + userInput);

        // Test factorial calculation
        int factorialInput = getInteger(1, 10);
        long factorial = calculateFactorial(factorialInput);
        System.out.println(factorialInput + "! = " + factorial);

        // Dice rolling simulation
        int numSides = getInteger(1, Integer.MAX_VALUE);
        rollDice(numSides, scanner);

        // High-Low guessing game
        playHighLowGame(scanner);

        scanner.close();
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
    }

    public static int modulus(int num1, int num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
    }

    public static int multiplyWithoutOperator(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }

        int result = 0;
        boolean isNegative = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        for (int i = 0; i < num2; i++) {
            result += num1;
        }

        return isNegative ? -result : result;
    }

    public static int multiplyWithRecursion(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiplyWithRecursion(num1, num2 - 1);
        } else {
            return -multiplyWithRecursion(num1, -num2);
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void rollDice(int numSides, Scanner scanner) {
        String choice;

        do {
            int dice1 = rollSingleDice(numSides);
            int dice2 = rollSingleDice(numSides);

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            System.out.print("Roll again? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));
    }

    public static int rollSingleDice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }

    public static void playHighLowGame(Scanner scanner) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int numGuesses = 0;

        System.out.println("Welcome to the High-Low guessing game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Let's see if you can guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("HIGHER");
            } else if (guess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! You got it in " + numGuesses + " guesses.");
                break;
            }
        }
    }
}
