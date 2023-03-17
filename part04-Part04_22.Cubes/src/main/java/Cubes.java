
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String message = scanner.nextLine();
            if(message.equals("end")){
                break;
            } 
            int ans = Integer.valueOf(message);
            if (ans > 0){
                System.out.println(ans * ans * ans);
            } else {
                System.out.println(ans);
            }
        }
    }
}
