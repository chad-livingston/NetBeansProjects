import java.util.ArrayList;

public class Package {
    private int totalWeight;
    private final ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift) {
        gifts.add(gift);

    }

    public int totalWeight() {
        if (gifts.size() > 0) {
            for (Gift item : gifts) {
                this.totalWeight += item.getWeight();
            }
        }
        return totalWeight;
    }
}
