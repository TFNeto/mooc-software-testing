package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @ParameterizedTest(name = "TestString={0} ,ExpectedCount={1}")
    @CsvSource({"cats|dogs,2","car|bar,2"})
    public void ParammultipleMatchingWords(String TestString, int ExpectedCount){
        int words = new CountLetters().count(TestString);
        Assertions.assertEquals(ExpectedCount, words);
    }
    @Test
    public void NoWordMatch() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }
}

