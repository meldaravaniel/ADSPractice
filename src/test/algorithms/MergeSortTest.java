package test.algorithms;

import main.algorithms.MergeSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 3/12/2017.
 */
public class MergeSortTest {

    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    @Test
    public void sort() throws Exception {
        long startTime = System.currentTimeMillis();

        MergeSort sorter = new MergeSort();
        printArray(numbers);
        sorter.sort(numbers);


        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Mergesort " + elapsedTime);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                fail("Should not happen");
            }
        }
        assertTrue(true);
        printArray(numbers);
    }

    private void printArray(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

}