package test.arrays;

import main.arrays.Fibonacci;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by kgresmer on 12/26/2016.
 */
public class FibonacciTest {

    @Test
    public void testFib() {
        long startTime = System.nanoTime();
        assertEquals(BigInteger.valueOf(102334155), Fibonacci.findInSeries(40));
        assertEquals(BigInteger.valueOf(9227465), Fibonacci.findInSeries(35));
        long finishTime = System.nanoTime();
        System.out.println("Iterative: " + (finishTime - startTime)/10000);
    }

    @Test
    public void testRecursiveFib() {
        long startTime2 = System.nanoTime();
        assertEquals(102334155, Fibonacci.findInSeriesRecursion(40));
        assertEquals(9227465, Fibonacci.findInSeriesRecursion(35));
        long finishTime2 = System.nanoTime();
        System.out.println("Recursive: " + (finishTime2 - startTime2)/10000);
    }

}