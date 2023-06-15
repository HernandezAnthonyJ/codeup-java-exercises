import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {

//        String name = "codeup";
//        System.out.println(name);
//        System.out.print(name);
//        System.out.print(name);
//        System.out.print(name);

//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//
//        System.out.println("Hello there, " + name + " Nice to see you.");

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s! %n", greeting, name);
//        System.out.printf("%s, %s!",name , greeting);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


        System.out.print("Enter something again: ");
        String userInput2 = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput2 + "\" <--");


    }
}