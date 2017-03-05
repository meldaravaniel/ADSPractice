package main.arrays;

import java.util.Arrays;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class ZeroIndexToZeroRow {

    //Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
    //column is set to 0

    public static int[][] checkForZeroes(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int i : matrix[index]) {
                if (i == 0) {
                    Arrays.fill(matrix[index], 0);
                }
            }
        }
        return matrix;
    }
}
