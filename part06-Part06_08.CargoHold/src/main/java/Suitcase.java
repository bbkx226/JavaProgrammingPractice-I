import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        int total = totalWeight() + item.getWeight();
        if(total <= this.maxWeight){
            items.add(item);
        }
    }

    public int totalWeight(){
        int ans = 0;
        for(Item item: items){
            ans += item.getWeight();
        }
        return ans;
    }

    public String toString(){
        String printOut = "";
        if (items.isEmpty()) {
            printOut = "no items";
        }
        if (items.size() == 1) {
            printOut = "1 item";
        }

        if (items.size() > 1) {
            printOut = items.size() + " items";
        }

        return printOut + " (" + this.totalWeight() + " kg)";
    }

    public void printItems(){
        for(Item item: items){
            System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
        }
    }

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }

        Item obj = this.items.get(0);
        for (Item item : items){
            if(obj.getWeight() < item.getWeight()){
                obj = item;
            }
        }
        return obj;
    }
}
