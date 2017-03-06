package test.linkedlists;

import main.linkedlists.RemoveDupsFromUnsorted;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class RemoveDupsFromUnsortedTest {
    @Test
    public void removeDups() throws Exception {
        LinkedList temp1 = new LinkedList<>(
                Arrays.asList(1,3,4,5,6,7,3)
        );
        LinkedList eresult = new LinkedList<>(
                Arrays.asList(1,3,4,5,6,7)
        );
        LinkedList result = RemoveDupsFromUnsorted.removeDups(temp1);
        assertEquals(eresult.size(), result.size());
        assertTrue(eresult.equals(result));
    }

}