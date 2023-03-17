
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        System.out.println(valueOne + " + " + valueTwo + " = " + (valueOne + valueTwo));
        System.out.println(valueOne + " - " + valueTwo + " = " + (valueOne - valueTwo));
        System.out.println(valueOne + " * " + valueTwo + " = " + (valueOne * valueTwo));
        System.out.println(valueOne + " / " + valueTwo + " = " + ((double) valueOne / valueTwo));
        // Write your program here

    }
}
