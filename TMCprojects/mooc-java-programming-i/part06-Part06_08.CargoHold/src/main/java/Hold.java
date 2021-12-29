import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases = new ArrayList<>();


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase suitcase1 : this.suitcases) {
            totalWeight += suitcase1.totalWeight();
        }
        if (suitcase.totalWeight() < maxWeight) {
            if (suitcase.totalWeight() <= (maxWeight - totalWeight)) {
                suitcases.add(suitcase);
            }
        }
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
