
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int valueOne = scanner.nextInt();
        System.out.print("Last number? ");
        int valueTwo = scanner.nextInt();
        int ans = 0;
        while(valueOne<=valueTwo){
            ans += valueOne;
            valueOne++;
        }
        System.out.println("The sum is " + ans);
    }
}
