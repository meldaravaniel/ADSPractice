package test;

import main.recursion.BasicExamplesAndNotes;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2/27/2017.
 */
public class BasicExamplesAndNotesTest {
    @Test
    public void getTriangularNumberRecursive() throws Exception {
        BasicExamplesAndNotes.getTriangularNumberRecursive(5);
        assertTrue(true);
    }

    @Test
    public void getFactorialRecursive() throws Exception {
        BasicExamplesAndNotes.getFactorialRecursive(5);
        assertTrue(true);
    }

}