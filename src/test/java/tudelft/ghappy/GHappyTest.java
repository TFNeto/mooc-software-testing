package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "TestString={0}")
    @CsvSource({"gggggggggggg"})
    public void allGs (String str){
        boolean result = new GHappy().gHappy(str);
        Assertions.assertTrue(result);
    }
    @ParameterizedTest(name = "TestString={0}")
    @CsvSource({"agga", "cakiggmmgg","xxggxx"})
    public void isHappyG (String str){
        boolean result = new GHappy().gHappy(str);
        Assertions.assertTrue(result);
    }
    @ParameterizedTest(name = "TestString={0}")
    @CsvSource({"ascgjkrgfpd", "aaagaaaaagaaaa","xxgxx"})
    public void isNotHappyG (String str){
        boolean result = new GHappy().gHappy(str);
        Assertions.assertFalse(result);
    }

}
