
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private final ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (totalWeightOfSuitcases() < maxWeight) {
            if (suitcase.totalWeight() <= (maxWeight - totalWeightOfSuitcases())) {
                suitcases.add(suitcase);
            }
        }

    }

    public int totalWeightOfSuitcases() {
        int totalWeight = 0;
        for (Suitcase suitcases : this.suitcases) {
            totalWeight += suitcases.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int holdWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            holdWeight += suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases (" + holdWeight + " kg)";

    }

}
