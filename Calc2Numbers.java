import java.util.Scanner;

public class Calc2Numbers {
    private static Scanner input;

    public static void main(final String[] args) {
        final int number1 = user_input("1st");
        final int number2 = user_input("2nd");

        System.out.println("The total for your two numbers is "
            + add2Numbers(number1, number2));
    }

    public static int user_input(final String whatNumber) {
        input = new Scanner(System.in);
        System.out.print("Enter the " + whatNumber + " number: ");
        return input.nextInt();
    }

    public static int add2Numbers(final int num1, final int num2) {
        return num1 + num2;
    }
}
