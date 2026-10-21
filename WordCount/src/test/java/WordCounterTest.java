import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    @DisplayName("0 on empty string")
//    @ParameterizedTest
//    @ValueSource(strings = {"", ""})
    public void emptyStringReturnsZero() {
        WordCounter wordCounter = new WordCounter();

        int result = wordCounter.countWords("");

        assertEquals(0,result);

    }

    @Test
    @DisplayName("1 word returns 1")
    public void oneWordReturnsOne() {
        WordCounter wordCounter = new WordCounter();

        int result = wordCounter.countWords("oneWord");

        assertEquals(1,result);
    }

    @Test
    @DisplayName("3 words returns 3")
    public void multipleWordReturnsTheNumberOfWords() {
        WordCounter wordCounter = new WordCounter();
        int result = wordCounter.countWords("wordOne, wordTwo, wordThree");
        assertEquals(3,result);
    }



}
