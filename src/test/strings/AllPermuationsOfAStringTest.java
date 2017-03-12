package test.strings;

import main.strings.AllPermuationsOfAString;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2/27/2017.
 */
public class AllPermuationsOfAStringTest {
    @Test
    public void getAllPermutations() throws Exception {
        AllPermuationsOfAString.getAllPermutations("kevin");
        assertTrue(true);
    }

}