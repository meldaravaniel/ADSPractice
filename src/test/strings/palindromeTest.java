package test.strings;

import main.strings.Palindrome;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 12/26/2016.
 */
public class palindromeTest {

    @Test
    public void testPalindrome() {
        assertTrue(Palindrome.checkForPalindrome("Hannah"));
        assertFalse(Palindrome.checkForPalindrome("Hannag"));
    }

}