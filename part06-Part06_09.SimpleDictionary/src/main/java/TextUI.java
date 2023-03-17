import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String message = scanner.nextLine();
            if(message.equals("end")){
                break;
            }
            else if(message.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if(message.equals("search")){
                System.out.print("To be translated: ");
                String from = scanner.nextLine();
                String to = dict.translate(from);
                if(to == null){
                    System.out.print("Word " + from + " was not found");
                } else{
                    System.out.println("Translation: " + to);
                }
            }
            else {
                System.out.println("Unknown Command");
            }
        }
        System.out.println("Bye bye!");
    }
}
