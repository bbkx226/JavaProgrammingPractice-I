
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.print("Search for? ");
        int value = scanner.nextInt();
        for(int i=0; i < list.size(); i++){
            if(value == list.get(i)){
                System.out.println(value + " is at index " + i);
            }
        }
        // implement here finding the indices of a number
    }
}
