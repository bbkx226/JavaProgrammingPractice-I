
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, even = 0, odd = 0;
        System.out.println("Give numbers:");
        while (true){
            int value = scanner.nextInt();
            if (value == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (value % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum += value;
            count += 1;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
