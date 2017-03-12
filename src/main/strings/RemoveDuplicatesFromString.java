package main.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by chq-keving on 3/1/2017.
 */
public class RemoveDuplicatesFromString {

    //Design an algorithm and write code to remove the duplicate characters in a string
//    without using any additional buffer. NOTE: One or two additional variables are fine.
//    An extra copy of the array is not.
    public static String remove(String input) {
        if (input == null) return null;
        if (input.length() < 2) return input;
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            boolean dup = false;
            for (int j = 0; j < input.length() - 1; ++j) {
                if (i == j) break;
                if (chars[i] == chars[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) builder.append(chars[i]);
        }
        return builder.toString();
    }
}
