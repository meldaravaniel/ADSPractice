package test.strings;

import main.strings.Regex;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by kgresmer on 12/29/2016.
 */
public class RegexTest {


    @Test
    public void testTokenizer() {
        Regex.tokenizer("fake");
    }

    @Test
    public void testRegexPatterns() {
        assertTrue(Regex.validRegexPattern("([A-Z])(.+)"));
        assertFalse(Regex.validRegexPattern("[AZ[a-z](a-z)"));
        assertFalse(Regex.validRegexPattern("batcatpat(nat"));
    }

    @Test
    public void testIPAddresses() {
        assertTrue(Regex.validIPAddressPattern("000.12.12.034"));
        assertTrue(Regex.validIPAddressPattern("121.234.12.12"));
        assertTrue(Regex.validIPAddressPattern("23.45.12.56"));
        assertFalse(Regex.validIPAddressPattern("00.12.123.123123.123"));
        assertFalse(Regex.validIPAddressPattern("122.23"));
        assertFalse(Regex.validIPAddressPattern("Hello.IP"));
        assertTrue(Regex.validIPAddressPattern("2.2.2.2"));
        assertFalse(Regex.validIPAddressPattern("256.255.255.255"));
        assertTrue(Regex.validIPAddressPattern("0.1.0.0"));
        assertFalse(Regex.validIPAddressPattern("0.1.0"));
    }

    @Test
    public void testDupWords() {
        String input = "5\n" +
                "Goodbye bye bye world world world\n" +
                "Sam went went to to to his business\n" +
                "Reya is is the the best player in eye eye game\n" +
                "in inthe\n" +
                "Hello hello Ab aB";
        String expectedOutput = "Goodbye bye world\n" +
                "Sam went to his business\n" +
                "Reya is the best player in eye game\n" +
                "in inthe\n" +
                "Hello Ab\n";
        String output = Regex.removeDupWords(input);
        assertEquals(expectedOutput, output);
    }

}