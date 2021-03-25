package testDict;

import java.util.List;

public interface DictionaryService {
    List<String> getDictionary();
    boolean isEnglishWord(String word);
}
