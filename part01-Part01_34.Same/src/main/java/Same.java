
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String messageOne = scan.nextLine();
        System.out.println("Enter the second string:");
        String messageTwo = scan.nextLine();
        if (messageOne.equals(messageTwo)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        // Write your program here. 
    }
}
