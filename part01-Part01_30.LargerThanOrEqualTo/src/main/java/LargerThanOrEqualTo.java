
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int valueOne = scan.nextInt();
        System.out.println("Give the second number:");
        int valueTwo = scan.nextInt();
        if (valueOne > valueTwo) {
            System.out.println("Greater number is: " + valueOne);
        } else if (valueTwo > valueOne) {
            System.out.println("Greater number is: " + valueTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
