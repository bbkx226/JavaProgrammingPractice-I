public class Bird {
    private String name;
    private String latin;
    private int observations;

    public Bird(){
        this.observations = 0;
    }

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservations() {
        return observations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public String toString() {
        return this.name+" ("+this.latin+"): "+this.observations+" observations";
    }

}
