
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        
        if (elements.isEmpty()){
            return "The collection alphabet is empty.";
        } else {
            System.out.println("The collection has " + elements.size() + " elements:");
        }
        String elementsInCollection = "";
        
        
        for (String element : elements){
            
            elementsInCollection = elementsInCollection + element + "\n";
        }
        
        return elementsInCollection;
    }
    
}
