
public class HealthStation {
    private int count = 0;

    public int weigh(Person person) {
        count += 1;
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int weighings(){
        return count;
    }
}
