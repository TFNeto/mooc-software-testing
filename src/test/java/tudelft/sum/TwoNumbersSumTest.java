package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void noCarryUsedTest(){
        TwoNumbersSum sum= new TwoNumbersSum();
        ArrayList<Integer> first =new  ArrayList<Integer> (Arrays.asList(1,2,3));
        ArrayList<Integer> second =new  ArrayList<Integer> (Arrays.asList(1,2,3));
        ArrayList<Integer> expectedResult =new  ArrayList<Integer> (Arrays.asList(2,4,6));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void SumWithCarryTest(){
        TwoNumbersSum sum= new TwoNumbersSum();
        ArrayList<Integer> first =new  ArrayList<Integer> (Arrays.asList(1,2,9));
        ArrayList<Integer> second =new  ArrayList<Integer> (Arrays.asList(9,2,3));
        ArrayList<Integer> expectedResult =new  ArrayList<Integer> (Arrays.asList(1,0,5,2));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void NoValues(){
        TwoNumbersSum sum= new TwoNumbersSum();
        ArrayList<Integer> first =new  ArrayList<Integer> ();
        ArrayList<Integer> second =new  ArrayList<Integer> ();
        ArrayList<Integer> expectedResult =new  ArrayList<Integer> ();

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedResult,result);
    }

}
