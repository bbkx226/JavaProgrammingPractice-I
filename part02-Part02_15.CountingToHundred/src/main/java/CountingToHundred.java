
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for(int i = 100; value <= i; value ++){
            System.out.println(value);
        }
    }
}
