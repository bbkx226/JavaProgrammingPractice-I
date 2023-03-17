import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner){
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String message = scanner.nextLine();
            if(message.equals("stop")){
                break;
            } else if(message.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                todo.add(toAdd);
            } else if(message.equals("list")){
                todo.print();
            } else if(message.equals("remove")){
                System.out.print("Which one is removed? ");
                int removed = Integer.valueOf(scanner.nextLine());
                todo.remove(removed);
            }
        }
    }

    public void toRemove(String removed){
        
    }
}
