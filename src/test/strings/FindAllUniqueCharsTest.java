package test.strings;

import main.strings.FindAllUniqueChars;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FindAllUniqueCharsTest {

    @Test
    public void findUniqueCharsUsingSet() throws Exception {
        String input = "aasdfee";
        Set<Character> expectedResult = new HashSet<>();
        expectedResult.add('a');
        expectedResult.add('s');
        expectedResult.add('d');
        expectedResult.add('f');
        expectedResult.add('e');
        assertEquals(expectedResult, FindAllUniqueChars.findUniqueCharsUsingSet(input));
    }

    @Test
    public void findUniqueCharsUsingArray() throws Exception {
        String input = "aasdfee";
        char[] expectedResult = new char[256];
        expectedResult['a'] = 'a';
        expectedResult['s'] = 's';
        expectedResult['d'] = 'd';
        expectedResult['f'] = 'f';
        expectedResult['e'] = 'e';
        char[] testResults = FindAllUniqueChars.findUniqueCharsWithoutDS(input);
        assertTrue(Arrays.equals(expectedResult, testResults));
    }

    @Test
    public void testIfStringOnlyHasUniqueChars() {
        String input = "aasdfee";
        String input2 = "asdfe";
        assertFalse(FindAllUniqueChars.doesStringContainOnlyUniqueChars(input));
        assertTrue(FindAllUniqueChars.doesStringContainOnlyUniqueChars(input2));
    }

}