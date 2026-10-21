public class WordCounter {
    public int countWords(String s) {


        if(!s.isEmpty()){
           return s.split(" ").length;
        }

        return 0;

    }
}
