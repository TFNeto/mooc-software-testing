package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "TestMessage={0} ,Shift={1} ,ExpectedMessage={2}")
    @CsvSource({"a,1,b","z,1,a","a,26,a"})
    public void TestValidInput (String TestMessage,int shift,String ExpectedMessage){
        String result = new CaesarShiftCipher().CaesarShiftCipher(TestMessage,shift);
        Assertions.assertEquals(ExpectedMessage,result);
    }
    @ParameterizedTest(name = "TestMessage={0} ,Shift={1} ,ExpectedMessage={2}")
    @CsvSource({"3,6,invalid","55,1,invalid"})
    public void TestInvalidInput (String TestMessage,int shift,String ExpectedMessage){
        String result = new CaesarShiftCipher().CaesarShiftCipher(TestMessage,shift);
        Assertions.assertEquals(ExpectedMessage,result);
    }
}
