package main.algorithms;

/**
 * Created by kgresmer on 2/25/2017.
 */
public class BinarySearch {

    public static int search(int[] inputArray, int targetValue) {
        int min = 0;
        int max = inputArray.length -1;
        int guess;
        while (max >= min) {
            guess = (max + min) /2;
            if (inputArray[guess] < targetValue) {
                min = guess + 1;
            } else if (inputArray[guess] > targetValue) {
                max = guess - 1;
            } else {
                return guess;
            }
        }
        return -1;
    }
}
