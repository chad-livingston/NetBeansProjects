import java.util.HashMap;

public class SimpleDictionary {

    private final HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
    public boolean containsValue(String valueToSearch){
        if (translations.isEmpty()){
            return false;
        }
        if (translations.containsKey(valueToSearch)){
            return true;
        }
        return false;
    }
}
