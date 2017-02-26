package test.arrays;

import main.arrays.FindMinInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinInRotatedSortedArrayTest {

    @Test
    public void testMin() {
        int[] input = {3, 4, 5, 6, 1, 2};
        assertEquals(1, FindMinInRotatedSortedArray.findMinimum(input));
    }
}