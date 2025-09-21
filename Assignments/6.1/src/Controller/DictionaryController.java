package Controller;
import Model.Dictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String getMeaning(String word) {
        return dictionary.searchWord(word);
    }

    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }
}
