import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> items;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight()+suitcase.totalWeight() <= maxWeight){
            items.add(suitcase);
        }    
    }

    public int totalWeight(){
        int total = 0;
        for(Suitcase suit : items){
            total += suit.totalWeight();
        }
        return total;
    }

    public String toString() {
        return items.size() + " suitcases (" + this.totalWeight() + " kg )";
    }

    public void printItems(){
        for(Suitcase item: items){
            item.printItems();
        }
    }
}
