package test.strings;

import main.strings.RemoveDuplicatesFromString;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chq-keving on 3/1/2017.
 */
public class RemoveDuplicatesFromStringTest {

    @Test
    public void testRemovalOfDups() {
        String output = "abcd";
        assertEquals(output, RemoveDuplicatesFromString.remove("aabcdd"));
        String output2 = null;
        assertEquals(output2, RemoveDuplicatesFromString.remove(null));
        String output3 = "a";
        assertEquals(output3, RemoveDuplicatesFromString.remove("aaaaa"));
        String output4 = "ab";
        assertEquals(output4, RemoveDuplicatesFromString.remove("aaabbbb"));
        String output5 = "abcd";
        assertEquals(output5, RemoveDuplicatesFromString.remove("abcd"));
        String output6 = "ab";
        assertEquals(output6, RemoveDuplicatesFromString.remove("abababaab"));
    }
}