
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    public String longest(){
        String longest = "";
        for (String element : elements){
            //longest = "";
            if (element.length() > longest.length()){
                longest = element;
            }
        }
        if (longest.equals("")){
            longest = null;
        }
        return longest;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }


}
