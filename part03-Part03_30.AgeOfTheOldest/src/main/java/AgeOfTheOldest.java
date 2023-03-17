
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0 ;
        while (true) {
            String text = scanner.nextLine();
            if(text.isEmpty()){
                break;
            }
            String[] pieces = text.split(",");
            System.out.println(pieces[1]);
            if (Integer.valueOf(pieces[1]) > oldest){{
                oldest = Integer.valueOf(pieces[1]);
            }}
        }
        System.out.println(oldest);
    }
}
