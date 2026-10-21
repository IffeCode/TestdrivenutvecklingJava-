import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    @DisplayName("0 on empty string")
    public void emptyStringReturnsZero(){
        WordCounter wordCounter = new WordCounter();

        int result = wordCounter.countWords("");

        assertEquals(0,result);

    }



}
