package test.arrays;

import main.arrays.FindMinInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinInRotatedSortedArrayTest {

    @Test
    public void testMin() {
        int[] input = {3, 4, 5, 6, 1, 2};
        assertEquals(new Integer(1), FindMinInRotatedSortedArray.findMinimum(input));
        int[] input2 = {3, 4, 5, 6, -1, 0, 1, 2};
        assertEquals(new Integer(-1), FindMinInRotatedSortedArray.findMinimum(input2));
        int[] input3 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 2};
        assertEquals(new Integer(1), FindMinInRotatedSortedArray.findMinimum(input3));
        int[] input4 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 34, 35, 65, 71,
                72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 94, 95, 96, 97, 98, 99, 100, 101, 102,
                103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 1,2, 3, 4, 5};
        assertEquals(new Integer(1), FindMinInRotatedSortedArray.findMinimum(input4));
    }
}