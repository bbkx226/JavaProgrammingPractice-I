public class Gift {
    private String name;
    private int weigh;

    public Gift(String name, int weigh){
        this.name = name;
        this.weigh = weigh;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weigh;
    }

    public String toString(){
        return this.name + " (" + this.weigh + " kg)";
    }
}
