
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int value = scanner.nextInt();
        int ans = 1;
        for(int i=1;i<=value;i++){
            ans *= i;
        }
        System.out.println("Factorial: " + ans);
    }
}
