package Model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> map = new HashMap<>();

    public Dictionary() {
        addWord("hello", "A greeting");
        addWord("world", "The earth or globe");
        addWord("java", "A programming language");
    }

    public void addWord(String word, String definition) {
        map.put(word.toLowerCase(), definition);
    }

    public String searchWord(String word) {
        if (word == null) {
            return "Please provide a valid word.";
        } else if (map.containsKey(word.toLowerCase())) {
            return map.get(word.toLowerCase());
        } else {
            return "Word not found in the dictionary.";
        }
    }
}
