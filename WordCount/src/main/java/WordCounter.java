import java.util.HashSet;
import java.util.Set;

public class WordCounter {
    public int countWords(String s) {

        Set<String> words = new HashSet<>();


        if(!s.isEmpty()){
            for (String word : s.split(" ")){
                words.add(word);
            }
           return words.size();
        }

        return 0;

    }
}
