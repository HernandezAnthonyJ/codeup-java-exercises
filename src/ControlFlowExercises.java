import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();


        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);


        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);


        long l = 2;
        do {
            System.out.println(l);
            l *= l;
        } while (l < 1_000_000);


        for (int m = 0; m <= 100; m += 2) {
            System.out.println(m);
        }


        for (int n = 100; n >= -10; n -= 5) {
            System.out.println(n);
        }


        for (long o = 2; o < 1_000_000; o *= o) {
            System.out.println(o);
        }


        for (int p = 1; p <= 100; p++) {
            if (p % 3 == 0 && p % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (p % 3 == 0) {
                System.out.println("Fizz");
            } else if (p % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(p);
            }
        }


        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("What number would you like to go up to? ");
            int number = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int q = 1; q <= number; q++) {
                int square = q * q;
                int cube = q * q * q;
                System.out.printf("%-6d | %-7d | %-5d%n", q, square, cube);
            }

            System.out.print("Do you want to continue? (y/n) ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        scanner.close();
    }
}
