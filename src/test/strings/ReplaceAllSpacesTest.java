package test.strings;

import main.strings.ReplaceAllSpaces;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chq-keving on 3/3/2017.
 */
public class ReplaceAllSpacesTest {

    @Test
    public void replace() throws Exception {
        String spaceful = " d d d d d ";
        String spaceful2 = "dddd d";
        String spaceful3 = "ddddd";
        String spaceful4 = "     ";
        String nothing = null;
        long startTime = System.nanoTime();
        assertEquals("%20d%20d%20d%20d%20d%20", ReplaceAllSpaces.replace(spaceful));
        assertEquals("dddd%20d", ReplaceAllSpaces.replace(spaceful2));
        assertEquals("ddddd", ReplaceAllSpaces.replace(spaceful3));
        assertEquals("%20%20%20%20%20", ReplaceAllSpaces.replace(spaceful4));
        assertEquals(null, ReplaceAllSpaces.replace(nothing));
        long finishTime = System.nanoTime();
        System.out.println("Iterative: " + (finishTime - startTime)/10000);
    }

    @Test
    public void replaceWithBuilder() throws Exception {
        String spaceful = " d d d d d ";
        String spaceful2 = "dddd d";
        String spaceful3 = "ddddd";
        String spaceful4 = "     ";
        String nothing = null;
        long startTime = System.nanoTime();
        assertEquals("%20d%20d%20d%20d%20d%20", ReplaceAllSpaces.replaceWithBuilder(spaceful));
        assertEquals("dddd%20d", ReplaceAllSpaces.replaceWithBuilder(spaceful2));
        assertEquals("ddddd", ReplaceAllSpaces.replaceWithBuilder(spaceful3));
        assertEquals("%20%20%20%20%20", ReplaceAllSpaces.replaceWithBuilder(spaceful4));
        assertEquals(null, ReplaceAllSpaces.replaceWithBuilder(nothing));
        long finishTime = System.nanoTime();
        System.out.println("Iterative: " + (finishTime - startTime)/10000);
    }

}