
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThree = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (valueOne+valueTwo+valueThree));
        // Write your program here

    }
}
