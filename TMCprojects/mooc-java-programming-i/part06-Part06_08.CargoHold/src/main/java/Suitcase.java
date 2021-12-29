import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private final int maxWeight;
    //private int suitcaseWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item) {

        if (totalWeight() < maxWeight) {
            if (item.getWeight() <= (maxWeight - totalWeight())) {
                items.add(item);
            }
        }
    }


    public void printItems(){
        for (Item item : this.items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        int suitcaseWeight = 0;
        for (Item item : items) {
            suitcaseWeight += item.getWeight();
        }

        return suitcaseWeight;
    }
    public Item heaviestItem(){
        if (items.size() == 0){
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item item : items){
            if (heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }


    public String toString(){
        if (items.size() == 0){
            return "no items (" + totalWeight() + " kg)";
        }
        if (items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

}
