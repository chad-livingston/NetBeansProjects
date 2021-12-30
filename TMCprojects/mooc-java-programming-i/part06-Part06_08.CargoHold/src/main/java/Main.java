
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(5);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(5);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(8);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
