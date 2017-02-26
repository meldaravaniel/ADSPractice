package main.arrays;


public class FindMinInRotatedSortedArray {

    public static int findMinimum(int[] input) {
        if (input.length == 0) {
            return -1;
        }
        int lowest = input[0];
        int current;
        int left = input[0];
        int right = input[input.length/2];
        while (left < right) {
            if (left > right) {
                lowest = right;
            } else {

            }
        }
        return lowest;
    }
}