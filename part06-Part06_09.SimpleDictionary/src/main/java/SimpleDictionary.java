
import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    boolean containsValue(String word) {
        for (Map.Entry<String, String> entry : translations.entrySet()) {
            if (word.equals(entry.getKey())) {
                return true;
            }

        }
        
        return false;
    }
}
