
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String start = "The collection " + this.name;
        String result = "";
        String list = "";
        if(this.elements.isEmpty()){
            result = start + " is empty.";
        }

        if(this.elements.size() == 1){
            result = start + " has " + elements.size() + " element:" + "\n";
            result += this.elements.get(0);
        }

        if(this.elements.size() > 1){
            result = start + " has " + elements.size() + " elements:" + "\n";
        
            for(String name : elements){
                list += name + "\n";
            }

            result += list;
        }

        return result;
    }
    
}
