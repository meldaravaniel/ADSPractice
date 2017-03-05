package test.arrays;

import main.arrays.ZeroIndexToZeroRow;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class ZeroIndexToZeroRowTest {
    @Test
    public void checkForZeroes() throws Exception {
        int[][] arr = new int[3][];
        arr[0] = new int[]{3, 4, 5};
        arr[1] = new int[]{3, 0, 5};
        arr[2] = new int[]{3, 4, 5};
        printArray(arr);
        int[][] result = ZeroIndexToZeroRow.checkForZeroes(arr);
        printArray(result);
        assertTrue(Arrays.deepEquals(arr, result));
    }

    private void printArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}