package main.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kgresmer on 2/25/2017.
 */
public class MergeSort {

    public static int[] sort(int[] input) {
        int high = input.length;

        if (high < 2) return input;

        int middle = high/2;
        int[] left = Arrays.copyOfRange(input, 0, middle);
        int[] right = Arrays.copyOfRange(input, middle, high);
        return merge(sort(left), sort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j =0;
        ArrayList<Integer> result = new ArrayList<>();
        while( i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result.add(left[i++]);
            } else {
                result.add(right[j++]);
            }
        }
        return result.add();
    }
}
