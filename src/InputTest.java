import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("String entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean yesNo = input.yesNo();
        System.out.println("Yes/No entered: " + yesNo);

        int intInRange = input.getInt(1, 10);
        System.out.println("Integer in range: " + intInRange);

        int intNumber = input.getInt();
        System.out.println("Integer number: " + intNumber);

        double doubleInRange = input.getDouble(1.0, 10.0);
        System.out.println("Double in range: " + doubleInRange);

        double doubleNumber = input.getDouble();
        System.out.println("Double number: " + doubleNumber);
    }
}
