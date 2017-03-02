package main.arrays;

import java.math.BigInteger;

/**
 * Created by kgresmer on 12/26/2016.
 */

public class Fibonacci {

    public static BigInteger findInSeries(int n) {
        BigInteger[] series = new BigInteger[n + 1];
        series[0] = BigInteger.valueOf(0);
        series[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1].add(series[i - 2]);
        }
        return series[n];
    }

    public static int findInSeriesRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return findInSeriesRecursion(n-1) + findInSeriesRecursion(n-2);
    }
}
