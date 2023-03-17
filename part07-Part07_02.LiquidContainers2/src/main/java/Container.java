public class Container {
    private int litre;
    public Container(){
        litre = 0;
    }

    public int contains(){
        return this.litre;
    }

    public void add(int amount){
        if(amount > 0){
            litre += amount;
        }

        if(litre > 100){
            litre = 100;
        }
    }

    public void remove(int amount){
        litre -= amount;
        if (litre < 0){
            litre = 0;
        }
    }

    public String toString(){
        return litre + "/100";
    }
}
