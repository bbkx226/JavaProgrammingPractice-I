import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> items;

    public Package(){
        this.items = new ArrayList<>();
    }

    public void addGift(Gift gift){
        items.add(gift);
    }

    public int totalWeight(){
        int sum = 0;
        for(Gift item : items){
            sum += Integer.valueOf(item.getWeight());
        }
        return sum;
    }

}
