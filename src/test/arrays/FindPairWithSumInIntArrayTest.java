package test.arrays;

import main.arrays.FindPairWithSumInIntArray;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class FindPairWithSumInIntArrayTest {

    private static final int[] SORTED_NUMBERS = { 1, 2, 3, 4, 7, 8, 9, 12, 14, 15, 16, 17, 18 };
    private static final int[] NON_SORTED_NUMBERS = { 1, 11, 6, 8, 2, 3, 7, 18, 12, 4, 1, 2, 5, 15, 14, 9};

    @Before
    public void setup() {

    }

    @Test
    public void FindPairWithSumInOrderedArrayTest() {
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInSortedArray(SORTED_NUMBERS, 20));
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInSortedArray(SORTED_NUMBERS, 27));
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInSortedArray(SORTED_NUMBERS, 4));
        assertFalse(FindPairWithSumInIntArray.hasPairWithSumInSortedArray(SORTED_NUMBERS, 2));
        assertFalse(FindPairWithSumInIntArray.hasPairWithSumInSortedArray(SORTED_NUMBERS, 0));
    }

    @Test
    public void FindPairWithSumInNonOrderedArrayTest() {
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInNonSortedArray(NON_SORTED_NUMBERS, 20));
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInNonSortedArray(NON_SORTED_NUMBERS, 27));
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInNonSortedArray(NON_SORTED_NUMBERS, 4));
        assertTrue(FindPairWithSumInIntArray.hasPairWithSumInNonSortedArray(NON_SORTED_NUMBERS, 2));
        assertFalse(FindPairWithSumInIntArray.hasPairWithSumInNonSortedArray(NON_SORTED_NUMBERS, 0));
    }
}