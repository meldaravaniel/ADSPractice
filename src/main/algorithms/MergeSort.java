package main.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kgresmer on 2/25/2017.
 */
public class MergeSort {
    private int[] numbers;
    private int[] helper;
    private int length;

    public  void sort(int[] values) {
        this.numbers = values;
        length = values.length;
        this.helper = new int[length];
        mergeSort(0, length - 1);
    }

    private  void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle+1, high);
            merge(low, middle, high);
        }
    }

    private  void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {

            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }

}
