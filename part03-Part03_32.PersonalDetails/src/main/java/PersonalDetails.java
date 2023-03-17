
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0, count = 0;
        while (true){
            String message = scanner.nextLine();
            if(message.isEmpty()){
                break;
            }
            String[] pieces = message.split(",");
            if(pieces[0].length() > name.length()){
                name = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) sum / count));
    }
}
