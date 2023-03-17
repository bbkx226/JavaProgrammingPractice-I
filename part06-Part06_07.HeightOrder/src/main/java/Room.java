import java.util.ArrayList;

public class Room {
    private ArrayList<Person> items;

    public Room(){
        this.items = new ArrayList<>();
    }

    public void add(Person person){
        items.add(person);
    }

    public boolean isEmpty(){
        if(items.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return items;
    }
    
    public Person shortest(){
        if(this.items.isEmpty()){
            return null;
        }

        Person obj = this.items.get(0);
        for (Person item : items){
            if(obj.getHeight() > item.getHeight()){
                obj = item;
            }
        }

        return obj;
    }

    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        Person deletePerson = this.shortest();
        this.items.remove(deletePerson);
        return deletePerson;
    }
}
