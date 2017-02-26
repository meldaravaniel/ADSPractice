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
        System.out.println("Iterative: " + (finishTime - startTime));
    }

    @Test
    public void testRecursiveFib() {
        long startTime = System.nanoTime();
        assertEquals(BigInteger.valueOf(102334155), Fibonacci.findInSeries(40));
        assertEquals(BigInteger.valueOf(9227465), Fibonacci.findInSeries(35));
        long finishTime = System.nanoTime();
        System.out.println("Recursive: " + (finishTime - startTime));
    }

}