import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("User input: " + userInput);

        scanner.nextLine();

        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Words entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        scanner.nextLine();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Entered sentence: " + sentence);

        System.out.print("Enter the length of the classroom: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the width of the classroom: ");
        double width = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}
