import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob: Hi, I'm Bob. What do you want?");
        String input = scanner.nextLine();

        if (input.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (input.endsWith("!")) {
            System.out.println("Bob: Whoa, chill out!");
        } else if (input.trim().isEmpty()) {
            System.out.println("Bob: Fine. Be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }

        scanner.close();
    }
}
