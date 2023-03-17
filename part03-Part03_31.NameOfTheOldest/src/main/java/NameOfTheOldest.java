
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0 ;
        String name = "";
        while (true) {
            String text = scanner.nextLine();
            if(text.isEmpty()){
                break;
            }
            String[] pieces = text.split(",");
            if (Integer.valueOf(pieces[1]) > oldest){{
                oldest = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }}
        }
        System.out.println("Name of the oldest: " + name);

    }
}
