package main.arrays;


public class FindMinInRotatedSortedArray {

    public static int findMinimum(int[] input) {
        if (input.length == 0) {
            return -1;
        }
        int left = 0;
        int right = input.length/2;
        while ((input[left] < input[right]) || ((right - left) > 1)) {
            if (input[left] < input[right]) {
                left = right;
                right = input.length - 1;
            } else if (input[right] < input[left + (right - left)/2]){
                left = left + (right - left)/2;
            } else {
                right = left + (right - left)/2;
            }
        }
        return input[right];
    }
}