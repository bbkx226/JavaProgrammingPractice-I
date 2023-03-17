
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics state = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        while (true){
            int value = scanner.nextInt();
            if (value == -1){
                break;
            }
            state.addNumber(value);

            if (value % 2 == 0){
                even.addNumber(value);
            } else{
                odd.addNumber(value);
            }
        }
        System.out.println("Sum: " + state.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
