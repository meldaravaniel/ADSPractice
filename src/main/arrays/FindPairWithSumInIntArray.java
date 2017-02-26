package main.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kgresmer on 12/18/2016.
 */

public class FindPairWithSumInIntArray {

    public static boolean hasPairWithSumInSortedArray(int [] input, int sum) {
        int upperEnd = input.length-1;
        int lowerEnd = 0;
        while (lowerEnd < upperEnd) {
            int potentialSum = input[upperEnd] + input[lowerEnd];
            if (potentialSum == sum) {
                return true;
            }
            if (input[upperEnd] + input[lowerEnd] - sum > 0) {
                upperEnd--;
            } else {
                lowerEnd++;
            }
        }
        return false;
    }

    public static boolean hasPairWithSumInNonSortedArray(int[] input, int sum) {
        Map<Integer, Integer> complements = new HashMap<Integer, Integer>();
        for (int value: input) {
            if (complements.values().contains(value)) {
                System.out.println("Sum to find: " + sum + " Pair: " + complements.get(sum - value) + " + " + (sum - value));
                return true;
            } else {
                complements.put(value, sum - value);
            }
        }
        return false;
    }
}
