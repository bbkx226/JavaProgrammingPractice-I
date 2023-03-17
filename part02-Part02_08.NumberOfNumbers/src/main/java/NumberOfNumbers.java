
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            if(value == 0){
                break;
            }
            ans += 1;
        }
        System.out.println("Number of numbers: " + ans);
    }
}
