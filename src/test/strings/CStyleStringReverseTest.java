package test.strings;

import main.strings.CStyleStringReverse;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chq-keving on 3/1/2017.
 */
public class CStyleStringReverseTest {

    @Test
    public void reverse() throws Exception {
        String output = "dcba";
        assertEquals(output, CStyleStringReverse.reverse("abcd"));
    }

}