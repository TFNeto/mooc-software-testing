package tudelft.mirrorends;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.mirrorends.mirrorEnds;

public class mirrorEndsTest {
    @Test
    public void NoMirrortest() {
        String mirror = new mirrorEnds().mirrorEnds("abcde");
        Assertions.assertEquals("", mirror);
    }
    @Test
    public void allMirror() {
        String mirror = new mirrorEnds().mirrorEnds("aba");
        Assertions.assertEquals("aba", mirror);
    }
    @Test
    public void multiMirror() {
        String mirror = new mirrorEnds().mirrorEnds("abXZba");
        Assertions.assertEquals("ab", mirror);
    }
    @Test
    public void noStringMirror() {
        String mirror = new mirrorEnds().mirrorEnds("");
        Assertions.assertEquals("", mirror);
    }
    @Test
    public void evenCharMirror() {
        String mirror = new mirrorEnds().mirrorEnds("abccba");
        Assertions.assertEquals("abccba", mirror);
    }
}
