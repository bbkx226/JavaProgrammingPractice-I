
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThird = Integer.valueOf(scanner.nextLine());
        double result = (double) (valueOne + valueTwo + valueThird) / 3;
        System.out.println("The average is " + result);
        // Write your program here

    }
}
