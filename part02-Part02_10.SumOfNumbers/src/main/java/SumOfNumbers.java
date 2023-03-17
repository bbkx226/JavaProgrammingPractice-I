
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            if(value == 0){
                break;
            }
            ans += value;
        }
        System.out.println("Sum of the numbers: " + ans);
    }
}
