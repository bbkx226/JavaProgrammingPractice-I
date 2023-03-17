
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0, count = 0;
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value > 0) {
                ans += value;
                count += 1;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) ans / count);
        }


    }
}
