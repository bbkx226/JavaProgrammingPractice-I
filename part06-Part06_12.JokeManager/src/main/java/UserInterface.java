import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands: \n 1 - add a joke\n 2 - draw a joke \n 3 - list jokes \n X - stop");
            String choice = scanner.nextLine();
            if(choice.equals("X")){
                break;
            } else if(Integer.valueOf(choice) == 1){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if(Integer.valueOf(choice) == 2){
                System.out.println(jokes.drawJoke()); 
            } else if(Integer.valueOf(choice) == 3){
                jokes.printJokes();
            }
        }
    }
}
