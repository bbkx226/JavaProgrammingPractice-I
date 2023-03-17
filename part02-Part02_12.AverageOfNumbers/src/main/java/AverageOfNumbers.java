
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0, count = 0;
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            if(value == 0){
                break;
            }
            count += 1;
            ans += value;
        }
        System.out.println("Average of the numbers: " + ((double) ans / count));
    }
}
