
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int value = scanner.nextInt();
        System.out.print("Where from? ");
        int valueB = scanner.nextInt();
        while (valueB <= value){
            System.out.println(valueB);
            valueB++;
        }
        // Write your program here
    }
}
