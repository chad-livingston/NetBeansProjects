import java.util.ArrayList;

public class Package {
    private int totalWeight;
    private ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift){
        gifts.add(gift);
        if (gifts.size() > 0){
            for (Gift item : gifts){
                totalWeight += item.getWeight();
            }
        }
    }
    public int totalWeight(){
        return this.totalWeight;
    }
}
