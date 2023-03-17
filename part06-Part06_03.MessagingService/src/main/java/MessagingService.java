import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> items;

    public MessagingService(){
        this.items = new ArrayList<>();
    }
    
    public void add(Message message){
        if(message.getContent().length() <= 280){
            this.items.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return this.items;
    }
}
