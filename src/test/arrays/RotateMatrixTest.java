package test.arrays;

import main.arrays.RotateMatrix;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 3/3/2017.
 */
public class RotateMatrixTest {
    @Test
    public void rotate() throws Exception {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};
        int[][] eResult = new int[3][3];
        eResult[0] = new int[]{7, 4, 1};
        eResult[1] = new int[]{8, 5, 2};
        eResult[2] = new int[]{9, 6, 3};
        int[][] result =  RotateMatrix.rotate(matrix);
        printArray(result);
        printArray(eResult);
        assertTrue(Arrays.deepEquals(eResult, result));
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