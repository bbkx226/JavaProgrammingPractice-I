
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int value = scanner.nextInt();
        int ans = 0;
        for(int i = 1;i <= value;i++){
            ans += i;
        }
        System.out.println("The sum is " + ans);
    }
}
