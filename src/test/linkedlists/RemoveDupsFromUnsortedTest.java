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
        assertTrue(eresult.equals(result));
    }

    @Test
    public void removeDupsNoBuffer() throws Exception {
        LinkedList temp1 = new LinkedList<>(
                Arrays.asList(1,3,4,5,6,7,3,4,5, 8,9,10)
        );
        LinkedList eresult = new LinkedList<>(
                Arrays.asList(1,3,4,5,6,7,8,9,10)
        );
        LinkedList result = RemoveDupsFromUnsorted.removeDupsNoBuffer(temp1);
        assertTrue(eresult.equals(result));
    }

    @Test
    public void removeDupsNoBuffer2() throws Exception {
        LinkedList temp1 = new LinkedList<>(
                Arrays.asList(3,3)
        );
        LinkedList eresult = new LinkedList<>(
                Arrays.asList(3)
        );
        LinkedList result = RemoveDupsFromUnsorted.removeDupsNoBuffer(temp1);
        assertTrue(eresult.equals(result));
    }

}