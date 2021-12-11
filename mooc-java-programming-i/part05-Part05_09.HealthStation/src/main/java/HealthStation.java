
public class HealthStation {

    public int weight;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter+
        if (weight != 0) {
            return weight;
        } else {
            this.weight = person.getWeight();
            return weight;
        }

    }

    public void feed(Person person) {
        weight = person.getWeight() + 1;
    }

}
