
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fl = 0, sl = 0;
        while (true) {
            System.out.println("First: " + fl + "/100");
            System.out.println("Second: " + sl + "/100");
            String input = scan.nextLine();
            if(input.equals("quit")){
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                if(amount > 0){
                    fl += amount;
                }

                if(fl > 100){
                    fl = 100;
                }
            } else if(command.equals("move")){
                if(amount < fl){
                    fl -= amount;
                    sl += amount;
                } else{
                    sl += fl;
                    fl = 0;
                }
                
                if(sl > 100){
                    sl = 100;
                }

            } else if(command.equals("remove")){
                sl -= amount;
                if (sl < 0){
                    sl = 0;
                }
            }
            System.out.println();
        }
    }

}
